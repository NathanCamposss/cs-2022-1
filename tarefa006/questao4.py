ipi = float(input('Informe o valor do IPI:'))
cod_peca1 = int(input('Informe o código da peça 1:'))
valor_uni1 = float(input('Informe o valor unitário da peça 1:'))
qtd_peca1 = int(input('Informe a quantidade de unidades da peça 1:'))
cod_peca2 = int(input('Informe o código da peça 2:'))
valor_uni2 = float(input('Informe o valor unitário da peça 2:'))
qtd_peca2 = int(input('Informe a quantidade de unidades da peça 2:'))

total = (valor_uni1*qtd_peca1+valor_uni2*qtd_peca2)*((ipi/100)+1)
print('O total a ser pago será de R${}'.format(total))
#codigo ok