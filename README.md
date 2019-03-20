# RMI-Client-Server

Comunicação cliente/servidor em três camadas: (1) Camada Cliente, (2) Camada de Aplicação, e (3) Camada de Banco de Dados. A camada 1 fica do lado do cliente, as camadas 2 e 3 ficam no servidor.

o	O usuário envia ao servidor um conjunto de números desordenados
o	A camada de Aplicação ordena os números, retorna o conjunto ordenado ao Cliente
o	A camada de Aplicação salva no banco de dados os valores ordenados da operação
