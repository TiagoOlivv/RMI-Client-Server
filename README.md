# Client-and-Server-with-RMI-Communication

Comunicação cliente/servidor em três camadas: 
<br />

(1) Camada Cliente, <br />
(2) Camada de Aplicação, e <br />
(3) Camada de Banco de Dados. 

A camada 1 fica do lado do cliente, as camadas 2 e 3 ficam no servidor.<br />

o O usuário envia ao servidor um conjunto de números desordenados;
<br />
o	A camada de Aplicação ordena os números, retorna o conjunto ordenado ao Cliente;
<br />
o	A camada de Aplicação salva no banco de dados os valores ordenados da operação.

Modo de Demostração: Insera um conjunto de números desordenados, o programa irá retornar os números ordenados de forma crescente e também salvar a operação no banco do servidor.
