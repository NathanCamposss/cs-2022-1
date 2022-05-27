
# O que é API?
Uma **API** é entendida como uma interface de programação de aplicação, ela é um conjunto de protocolos e normas que são utilizadas para a comunicação entre plataformas por meio de padrões. Podemos associar a API, de maneira análoga, a um contrato entre entre o provedor e usuário de informação, ela estabelece o conteúdo que será exigido por ambas a partes. Com a ajuda dela os desenvolvedores podem criar novos softwares capazes de se comunicar com outros tipos de plataforma, um bom exemplo disso é um software de fotos, o desenvolvedor pode ter acesso à câmera de um aparelho móvel por meio da API ao invés de ser necessário criar uma nova interface de câmera. O papel principal de uma API é facilitar o trabalho dos desenvolvedores e criar padrões para a criação de novas plataformas, além disso ela também é responsável pela segurança de dados ja que ela possue a capacidade de bloquear o acesso de dados

# O que é REST
Pode-se entender **REST** como um modelo de arquitetura que fornece diretrizes para que os sistemas sejam capazes de se comunicacarem diretamente utilizando os protocolos existentes na web. O príncipio _statelessness_ garante que o servidor não precisa saber o estado que o cliente está no momento e nem o cliente tem conhecimento do estado do servidor. Graças a esse modelo há uma melhor separação de responsabilidade entre a interface do usuário e o armazenamento de dados. A comunicação entre ambas as partes ocorre por meio do método solicitação-resposta (Cliente envia uma solicitação e o servidor envia uma resposta a essa solicitação). Quando há a presença de uma solicitação o servidor envia apenas os estados que foram pedidos pelo cliente

# O que é Rest API?
**Rest API** é uma interface de programação de aplicações que segue as restrições de estilo da arquitetura REST, o que por sua vez possibilita as interações com servições web RESTful. Rest é a sigla em inglês de _transferência de estado representacional_. Ela é responsável por permitir que aplicações softwares tenham autorização de utilizar funcionalidades oferecidas por essa aplicação sem ter a necessidade de conhecer a implementação das mesmas. Esse fator garante segurança de código e das regras de negócio do software. REST API é a abstração de uma arquitetura que fornece dados padronizados para modelos de requisição HTTP. Uma REST API possui princípios que deverão ser seguidos, são eles:
- **cliente-servidor:** Separação de responsabilidades, uma das carecterísticas da arquitetura _REST_
- **interface uniforme:** Interoperabilidades entre cliente e servidor. O contrato de comunicação dessas partes devem seguir quatro princípios:
1. Identificação de recursos;
2. Representação de recursos;
3. Mensagens auto-descritivas;
4. Componente HATEOAS.
- **stateless:** As requisições devem possuir informação necessária para realizar a comunicação, não sendo necessário que o servidor guarde o contexto
- **cache:** Melhora performance de comunicação entre as aplicações
- **camadas:** Cada camada deve ser capaz de se auto-gerenciar e serem independentes (de modo que a alteração em uma camada não altere o funcionamento das outras) e elas não podem conhecer as demais camadas. 
