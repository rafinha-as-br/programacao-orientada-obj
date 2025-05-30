Arquivo imprimir protocolo => recebe um protocolo da main e trata todas as informações desse protocolo

- classe protocolo guarda tudo as informações do paciente 
  - (requer classe Exame e Usuario para pegar dados pessoais)


protocolo contém:

- Cabeçalho
  - Informações do estabelecimento
  - Info e data do sistema (tipo de protocolo e data)
- Dados protocolo 
  - Código de barra
  - Solicitação
  - Nome do paciente
  - Sexo
  - Idade 
  - Matrícula 
  - Prontuário 
  - Idade em 
  - responsável (tenho que criar uma classe médico?)
  - solicitante (é um médico? novamente, preciso criar uma classe de médico?)
  
- Exames
- Rodapé (usuário vai ser o nome do usuário + dia do nascimento / e senha será a data de aniversário sem barras)

Classes:
- Classe Estabelecimento OK 
  - Endereço
  - cidade
  - estado
  - cep
  - Telefone

- Classe médico OK 
  - Nome

- Classe Usuário OK 
  - Nome 
  - Sexo
  - Idade
  - Data de nascimento (para usar na 'idade em: ')
  - Matrícula
  - Exames feitos
  - Prontuario

- Classe exame  OK 
  - String codigo exame
  - String descrição
  - Data do exame
  - Data de resultado (método feito)

- Classe Protocolo
  - Instância de estabelecimento
  - Instância de usuario
  - Instância de médico pra pegar o nome dele?
  - Data atual para calcular o dia que será o resultado?
