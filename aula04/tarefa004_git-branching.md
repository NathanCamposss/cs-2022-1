1. Qual o nome do branch padrão do Git?
**Resposta:** O Nome da branch padrão é *master*


2. O que o comando **<code>git branch nome</code>** realiza?
**Resposta:** Você irá alterar o nome da branch


3. Como criar um branch a partir de um commit específico?
**Resposta:** Usando o comando *git checkout -b 'nome_branch' 'id_commit'* 


4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?
**Resposta:** Cria o ramo de manutenção bugfix e o torna corrente imediatamente


5. Qual o comando para se alternar para um branch de nome **experimento2**?
**Resposta:** git checkout experimento2


6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?
**Resposta:** Irá listar todas as branchs que existente, porém haverá um asterístico na *b1*


7. O que o comando **<code>git checkout -b</code>** nome faz?
**Resposta:** Cria uma nova branch e a torna a branch corrente


8. Qual a função do <code>**comando git branch -d teste</code>**?
**Resposta:** Irá apagar a branch nomeada como 'teste'


9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.
**Resposta:**
1. git branch branch1
2. git checkout branch1
3. git add arq1.txt
4. git commit -m 'exemplo de commit'
5. git branch branch2
6. git checkout branch2
7. git add -u
8. git commit -m 'outro commit'
9. git checkout master
10. git merge branch1
11. git merge branch2 