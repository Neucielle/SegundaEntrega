CREATE DATABASE AgenciaValeDasEstrelas;
use AgenciaValeDasEstrelas;

CREATE TABLE Cliente (
IDCliente int AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
sobrenome VARCHAR(50),
endereco TEXT(50) NOT NULL,
email VARCHAR(50) NOT NULL,
telefone VARCHAR(20)
);

CREATE TABLE Cadastro (
 IDCadastro INT PRIMARY KEY AUTO_INCREMENT,
	IDCliente INT,
  InformacaoCliente TEXT NOT NULL,
  HistoricoCompra TEXT NOT NULL,
  FOREIGN KEY (IDCliente) REFERENCES cliente (IDCliente)
);

CREATE TABLE destino (
  IDDestino INT PRIMARY KEY AUTO_INCREMENT,
  NomeDestino VARCHAR(255) NOT NULL,
  Descricao TEXT,
  PrecoMedio DECIMAL(10, 2)
);

CREATE TABLE Viagem (
  IDViagem INT PRIMARY KEY AUTO_INCREMENT,
 DestinoID INT,
  Preco DECIMAL(10, 2),
  DataDeRetorno DATE,
  DataDePartida DATE,
  FOREIGN KEY (DestinoID) REFERENCES destino (IDDestino)
);

CREATE TABLE CompraViagem (
  IDCompra INT PRIMARY KEY AUTO_INCREMENT,
  DataCompra DATE,
  PrecoPago DECIMAL(10, 2),
  IDCliente INT,
  FOREIGN KEY (IDCliente) REFERENCES cliente (IDCliente)
);






