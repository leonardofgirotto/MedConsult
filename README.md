# MedConsult

Este projeto simula a criação de um sistema de gerenciamento de agenda para uma clínica médica.

## Estrutura do Projeto

- `controller`: O diretório `controller` contém os arquivos relacionados à lógica de controle da aplicação.
  
- `DAO`: Contém os arquivos relacionados às classes de acesso a dados, responsáveis por interagir com o banco de dados. Alguns dos principais arquivos neste diretório são:

    - `ConnectionFactory.java`: Classe que gerencia a conexão com o banco de dados.

    - `ConsultaDAO.java`: Classe para interação com dados de consultas médicas.

    - `MedicoDAO.java`: Classe para operações relacionadas a médicos.

    - `PacienteDAO.java`: Classe para operações relacionadas a pacientes.
      
- `services`: Contém os arquivos relacionados aos serviços da aplicação, que podem incluir lógica de negócios e processamento de dados.

- `model`: O diretório `model` é responsável pela lógica de dados da aplicação. 
- `view`: O diretório `view` contém os arquivos relacionados à interface do usuário.
- `imagens`: O diretório `imagens` contém os recursos gráficos utilizados na interface do usuário. 
- `lib`: O diretório `lib` contém as bibliotecas (JAR files) usadas no projeto. 

## Como Executar

1. Clone este repositório em sua máquina local:

   ```bash
   git clone https://github.com/M4FEUS/MedConsult.git

2. Configure um ambiente de servidor web local e um banco de dados, se necessário.

3. Importe os scripts SQL fornecidos para criar a estrutura do banco de dados.

4. Execute o aplicativo em seu computador.



