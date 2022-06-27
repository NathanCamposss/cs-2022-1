ano = int (input('Informe quantos anos de vida completo você tem:'))
mes = int (input('Informe quantos meses de vida você tem:'))
dias = int (input('Informe quantos dias de vida você tem:'))

total_dias = ano*365 + mes*30 + dias

print('Ele tem {} anos de vida'.format(total_dias))