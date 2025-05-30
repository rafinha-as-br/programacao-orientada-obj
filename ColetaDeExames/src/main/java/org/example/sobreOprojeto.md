Arquivo imprimir protocolo => recebe um protocolo da main e trata todas as informações desse protocolo

- classe protocolo guarda tudo as informações do paciente 
  - (requer classe Exame e Usuario para pegar dados pessoais)
  - Passar todas as informações para a classe protocolo


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
  - Matrícula (vem junto com o usuário??)
  - Prontuário (vem daonde?)
  - Idade em (oq faço aqui?)
  - responsável (tenho que criar uma classe médico?)
  - solicitante (é um médico? novamente, preciso criar uma classe de médico?)
  
- Exames
- Rodapé (usuário vai ser o nome do usuário + dia do nascimento / e senha será a data de aniversário sem barras)

Classes:
- Classe Estabelecimento
  - Endereço
  - cidade
  - estado
  - cep
  - Telefone

- Classe Usuário OK 
  - Nome 
  - Sexo
  - Idade
  - Data de nascimento (para usar na 'idade em: ')
  - Matrícula
  - Exames feitos
  - Prontuario

- Classe exame 
  - String codigo exame
  - String descrição
  - Data do exame
  - Data de resultado

- Classe Protocolo
  - Instância de estabelecimento
  - Instância de usuario
  - Instância de médico pra pegar o nome dele?
  - Data atual para calcular o dia que será o resultado?
