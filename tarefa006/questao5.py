SALARIO_MINIMO = 1045.00
# aqui eu deixei como constante porque no enunciado da questão ele afirma que um salario mínimo é 1045, logo ele não precisaria ser lido
salario = float(input('Informe seu salário:'))
qtd_SM = salario/SALARIO_MINIMO

print('O indivíduo possui um salário equivalente a {} salários mínimos'.format(qtd_SM))
#codigo ok