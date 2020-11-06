import pandas as pd

col_list = ["ID_REGISTRO", "SEXO", "ENTIDAD_RES", "FECHA_DEF",
            "EDAD", "DIABETES", "EPOC", "ASMA", "HIPERTENSION", "CARDIOVASCULAR",
            "OBESIDAD", "TABAQUISMO", "CLASIFICACION_FINAL"]

df = pd.read_csv('201029COVID19MEXICO.csv', usecols=col_list)

df = df.rename(columns={'ID_REGISTRO': 'ID_CASO', 'FECHA_DEF': 'DEFUNCION',
                        'CLASIFICACION_FINAL': 'CLASIFICACION'})
print('changing data')
# print(df.columns)
df.replace("9999-99-99", "2", True)

print(df.iat[0, 3])
print('changing less data')

i = 0
for row in df.itertuples(index=False, name=None):
    if df.iat[i, 3] != "2":
        df.iat[i, 3] = 1
    i += 1

print('creating csv')
df.to_csv('Datos_COVID.csv', index=False)

print('complete')
# "FECHA_ACTUALIZACION","ID_REGISTRO","ORIGEN","SECTOR",
# "ENTIDAD_UM","SEXO","ENTIDAD_NAC","ENTIDAD_RES","MUNICIPIO_RES",
# "TIPO_PACIENTE","FECHA_INGRESO","FECHA_SINTOMAS","FECHA_DEF","INTUBADO",
# "NEUMONIA","EDAD","NACIONALIDAD","EMBARAZO","HABLA_LENGUA_INDIG","INDIGENA",
# "DIABETES","EPOC","ASMA","INMUSUPR","HIPERTENSION","OTRA_COM","CARDIOVASCULAR",
# "OBESIDAD","RENAL_CRONICA","TABAQUISMO","OTRO_CASO","TOMA_MUESTRA","RESULTADO_LAB",
# "CLASIFICACION_FINAL","MIGRANTE","PAIS_NACIONALIDAD","PAIS_ORIGEN","UCI"
