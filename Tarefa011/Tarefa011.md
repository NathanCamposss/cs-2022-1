# O que é Padrão de codificação:
Um padrão que descreve várias convenções de codificação usadas para implementações inteligíveis, consistentes e com qualidade. O uso de um padrão de codificação é uma prática de desenvolvimento de software extensamente aceita.

# O que é reflexão:
Em ciência da computação, reflexão computacional (ou somente reflexão) é a capacidade de um programa observar ou até mesmo modificar sua estrutura ou comportamento.

# O que é programação defensiva:
Programação defensiva é um conjunto de técnicas de projeto (do inglês design) e programação objetivando a estabilidade e a segurança de um software independentemente de seu imprevisível. A ideia pode ser vista como forma de reduzir ou eliminar a hipótese de as Leis de Murphy terem efeito.

# Quando usar padrões de codificação:
Usa-se esse padrões quando deseja-se favilitar os processos de desenvolvimento, promover a retirada de bugs e auxiliar nas atividades de validação e manutenção. Além disso há aumento de produtividade
# Quando usar reflexão:
A reflexão ajuda os programadores a criar bibliotecas de software genéricas para exibir dados, processar diferentes formatos de dados, executar serialização ou desserialização de dados para comunicação ou agrupar e desagrupar dados para contêineres ou rajadas de comunicação.
O uso eficaz da reflexão quase sempre requer um plano: uma estrutura de design, descrição de codificação, biblioteca de objetos, um mapa de um banco de dados ou relações de entidade.A reflexão torna uma linguagem mais adequada ao código orientado à rede. A reflexão pode ser utilizada para auto-otimização ou auto-modificação de um programa. Um sub-componente reflexivo de um programa monitorará a execução e poderá otimizar-se ou modificar-se de acordo com a função que o programa está resolvendo. Isso pode ser feito modificando a própria área de memória do programa, onde o código está armazenado.

# Quando usar programação defensiva:
Utiliza-se programação defensiva quando deseja-se antecipar futuros problemas que poderiam acontecer ou quando o projeto trabalhado precisa estar funcionando eficientemente em pouco tempo,quando não há tempo para corrigir erros que forem surgindo

# Exemplos de padrão de codificação:
A linguagem java é responsável por usar alguns padrões tais como:
### Convenção de Nomes
Mantenha o tamanho dos nomes grande o bastante para transmitir o que eles representam. Exemplo: primeiroNome, sobrenome, ordemServico.

### Nomes de Classes e Interfaces
Os nomes de classe devem ser substantivos e, em caso de nomes compostos, utilize nomes com a primeira letra de cada palavra interna maiúscula. Use palavras inteiras evitando acrônimos e abreviaturas. Exemplo: Cliente ou ContaCliente.

### Nomes de Métodos
Os nomes dos métodos devem ser verbos, em casos compostos com o primeiro nome minúsculo, e com a primeira letra de cada palavra interna em maiúsculo. Exemplo: calcularPagamento().

#Exemplos de Reflexão:
 // Sem reflexão
 Foo foo = new Foo();
 foo.hello();
 
 // Com reflexão
 Class cl = Class.forName("Foo");
 Method method = cl.getMethod("hello", null);
 method.invoke(cl.newInstance(), null);

# Exemplos programação defensiva:
O teste é um dos aspectos mais importantes da programação defensiva. Apesar de muito esforço para garantir que o código seja perfeito, os desenvolvedores quase sempre perdem um erro ou criam código com resultados inesperados. Testes completos por testadores profissionais permitem que um desenvolvedor tenha centenas de horas de uso do produto para encontrar erros antes do lançamento do software.
