-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: entrega_checkpoint_02
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id_autor` int NOT NULL AUTO_INCREMENT,
  `nome_autor` varchar(100) NOT NULL,
  `ultimo_sobrenome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_autor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'J. R. R.','Tolkien'),(2,'George R. R.','Martin'),(3,'J. K. ','Rowling'),(4,'Stephen ','King'),(5,'Dan','Brown');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autoresxeditoras`
--

DROP TABLE IF EXISTS `autoresxeditoras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autoresxeditoras` (
  `id_autoresxeditoras` int NOT NULL AUTO_INCREMENT,
  `autores` int DEFAULT NULL,
  `editoras` int DEFAULT NULL,
  PRIMARY KEY (`id_autoresxeditoras`),
  KEY `fkautorxeditora` (`autores`),
  KEY `fkeditoraxautor` (`editoras`),
  CONSTRAINT `fkautorxeditora` FOREIGN KEY (`autores`) REFERENCES `autor` (`id_autor`),
  CONSTRAINT `fkeditoraxautor` FOREIGN KEY (`editoras`) REFERENCES `editora` (`id_editora`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autoresxeditoras`
--

LOCK TABLES `autoresxeditoras` WRITE;
/*!40000 ALTER TABLE `autoresxeditoras` DISABLE KEYS */;
INSERT INTO `autoresxeditoras` VALUES (1,1,1),(2,3,2),(3,5,3),(4,2,1),(5,5,NULL);
/*!40000 ALTER TABLE `autoresxeditoras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editora`
--

DROP TABLE IF EXISTS `editora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editora` (
  `id_editora` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cnpj` char(14) DEFAULT NULL,
  `endereco` varchar(150) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_editora`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editora`
--

LOCK TABLES `editora` WRITE;
/*!40000 ALTER TABLE `editora` DISABLE KEYS */;
INSERT INTO `editora` VALUES (1,'HarperCollins','12345678000100','Rua da Quitanda, 86','(21) 3175-1030'),(2,'Rocco','98765432000100','Rua Júlio Diniz, 56','(11) 3729-0244'),(3,'Editora Arqueiro','11222333000100','Rua Eng. Albert Leimer, 300','(21) 2538-4100');
/*!40000 ALTER TABLE `editora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emprestimo`
--

DROP TABLE IF EXISTS `emprestimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emprestimo` (
  `id_emprestimo` int NOT NULL AUTO_INCREMENT,
  `data_retirada` date NOT NULL,
  `data_devolucao` date NOT NULL,
  `usuario` int NOT NULL,
  `livro` int NOT NULL,
  PRIMARY KEY (`id_emprestimo`),
  KEY `fkusuarioemp` (`usuario`),
  KEY `livro` (`livro`),
  CONSTRAINT `emprestimo_ibfk_1` FOREIGN KEY (`livro`) REFERENCES `livro` (`id_livro`),
  CONSTRAINT `fkusuarioemp` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emprestimo`
--

LOCK TABLES `emprestimo` WRITE;
/*!40000 ALTER TABLE `emprestimo` DISABLE KEYS */;
INSERT INTO `emprestimo` VALUES (1,'2021-09-01','2021-09-11',1,1),(2,'2021-08-01','2021-08-11',1,2),(3,'2021-07-01','2021-07-11',1,3),(4,'2021-01-01','2021-01-21',2,4),(5,'2021-02-01','2021-02-21',2,1),(6,'2021-03-01','2021-03-15',5,12);
/*!40000 ALTER TABLE `emprestimo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historico_usuario`
--

DROP TABLE IF EXISTS `historico_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historico_usuario` (
  `id_historico` int NOT NULL AUTO_INCREMENT,
  `usuario_historico` int NOT NULL,
  `emprestimo_historico` int NOT NULL,
  PRIMARY KEY (`id_historico`),
  KEY `fkusuariohist` (`usuario_historico`),
  KEY `fkemprestimohist` (`emprestimo_historico`),
  CONSTRAINT `fkemprestimohist` FOREIGN KEY (`emprestimo_historico`) REFERENCES `emprestimo` (`id_emprestimo`),
  CONSTRAINT `fkusuariohist` FOREIGN KEY (`usuario_historico`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_usuario`
--

LOCK TABLES `historico_usuario` WRITE;
/*!40000 ALTER TABLE `historico_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `historico_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `livro`
--

DROP TABLE IF EXISTS `livro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `livro` (
  `id_livro` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) NOT NULL,
  `isbn` char(13) NOT NULL,
  `ano_lancamento` year DEFAULT NULL,
  `prefacio` text NOT NULL,
  `autor` int NOT NULL,
  `editora` int NOT NULL,
  PRIMARY KEY (`id_livro`),
  KEY `fkautor` (`autor`),
  KEY `fkeditora` (`editora`),
  CONSTRAINT `fkautor` FOREIGN KEY (`autor`) REFERENCES `autor` (`id_autor`),
  CONSTRAINT `fkeditora` FOREIGN KEY (`editora`) REFERENCES `editora` (`id_editora`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livro`
--

LOCK TABLES `livro` WRITE;
/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
INSERT INTO `livro` VALUES (1,'O Senhor dos Anéis: A Sociedade do Anel','8595084750',2019,'O volume inicial de O Senhor dos Anéis, lançado originalmente em julho de 1954, foi o primeiro grande épico de fantasia moderno, conquistando milhões de leitores e se tornando o padrão de referência para todas as outras obras do gênero até hoje. A imaginação prodigiosa de J.R.R. Tolkien e seu conhecimento profundo das antigas mitologias da Europa permitiram que ele criasse um universo tão complexo e convincente quanto o mundo real.',1,1),(2,'O Senhor dos Anéis: As Duas Torres','8595084777',2019,'O segundo volume de O Senhor dos Anéis, mais importante épico de fantasia moderno, narra os caminhos separados seguidos pelos membros da Sociedade do Anel em sua luta para deter Sauron, o Senhor Sombrio da terra de Mordor, e destruir o Um Anel, no qual está contida a maior parte do poder do tirano demoníaco imaginado por J.R.R. Tolkien.',1,1),(3,'O Senhor dos Anéis: O Retorno do Rei','8595084769',2019,'A guerra entre os Povos Livres da Terra-média e Sauron, o Senhor Sombrio da terra de Mordor, chega a seu clímax neste terceiro volume do romance O Senhor dos Anéis. As batalhas grandiosas que estão prestes a acontecer, no entanto, são apenas o pano de fundo para o verdadeiro drama: a missão quase suicida dos hobbits Frodo e Sam, que tentam destruir o Um Anel, fonte do poder de Sauron, infiltrando-se no coração do território do Inimigo.',1,1),(4,'Harry Potter e a Pedra Filosofal ','6899762693',1997,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed semper velit sit amet dolor imperdiet ultrices. Curabitur non dapibus magna. Nunc sit amet mattis mi. Pellentesque lobortis at elit ac dictum. Mauris faucibus nunc vel dapibus lacinia. Proin faucibus, libero at porta pharetra, ante mi posuere justo, vel molestie massa odio sed libero. Cras sagittis feugiat sollicitudin. Donec feugiat massa sem, ut rhoncus nunc ultricies non.',3,2),(5,'Harry Potter e a Câmara Secreta','9085771869',1998,'Aliquam id justo at est laoreet eleifend at sit amet metus. Curabitur eget elit vitae dui accumsan hendrerit nec ut mi. Nunc venenatis, nisl a cursus ullamcorper, mauris ex malesuada odio, quis semper tortor purus pulvinar purus. Pellentesque eu feugiat mi. Phasellus odio erat, dignissim bibendum varius quis, interdum non augue. Proin ac sollicitudin erat. Nam fringilla mauris vel risus posuere, vel tempor ante accumsan. Curabitur maximus facilisis nisl, eu tempus risus posuere a. Quisque in nulla sed augue maximus consequat at eu nibh. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque nunc risus, pharetra eget tempor ac, porttitor sed quam. Quisque ut urna interdum, accumsan sapien eu, tempor velit.',3,2),(6,'Harry Potter e o Prisioneiro de Azkaban ','2773546348',1999,'Etiam hendrerit iaculis imperdiet. Aliquam sit amet tortor enim. Nullam dolor sapien, scelerisque id leo non, tempor condimentum diam. Cras accumsan nunc massa, in bibendum purus malesuada non. Cras mi nisl, convallis ac neque non, consectetur hendrerit mi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Etiam elementum purus non ligula varius, vitae viverra velit vestibulum. Morbi metus purus, mattis ut commodo in, placerat et ligula. Nam finibus ornare mauris, ac euismod augue elementum in. Sed vitae ultrices nisl.',3,2),(7,'Harry Potter e o Cálice de Fogo','6567457672',2000,'Nunc ut purus neque. Nulla eget metus vel nulla rutrum finibus quis eu nulla. Vestibulum vulputate, purus ac venenatis congue, risus diam vulputate neque, a lobortis purus turpis nec libero. Mauris cursus orci quam, et luctus mauris vestibulum eu. Ut volutpat ac tortor at interdum. Sed justo leo, auctor eu quam et, sodales congue est. Sed mollis convallis dui. Sed faucibus, sem eget hendrerit pellentesque, purus urna porttitor orci, id volutpat ligula dui convallis augue. In hac habitasse platea dictumst. Fusce elementum at lectus sit amet tincidunt. Donec faucibus nisl ac sem mattis, ac semper orci scelerisque. Duis aliquam, urna sed elementum sagittis, nulla sapien rhoncus neque, vel venenatis ex diam a nisl. Mauris varius convallis orci, vel mollis ipsum. Quisque sodales nibh suscipit, elementum enim vulputate, bibendum nunc.',3,2),(8,'Harry Potter e a Ordem da Fênix ','6525869737',2003,'Donec at sapien id ipsum egestas lobortis. Sed auctor fermentum ante, non tincidunt augue iaculis lobortis. Cras risus lacus, pharetra id felis non, lobortis ultricies enim. Etiam dignissim turpis id tortor interdum, ut scelerisque quam sagittis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Duis eu arcu eu odio molestie laoreet vitae vel ante. Aenean rutrum rhoncus lectus ac faucibus. Praesent ante tellus, molestie ut porttitor eu, egestas a justo. Mauris ultrices nisl nec consequat porta. Morbi non odio velit. Nunc facilisis ligula velit, sit amet sollicitudin tellus tempus ut.',3,2),(9,'Harry Potter e o Enigma do Príncipe','3899967400',2005,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin blandit sodales diam eget consectetur. Praesent laoreet lectus sit amet enim placerat semper. Ut ac nulla a libero blandit sagittis. Donec in libero ac dolor viverra elementum et eu nisl. Fusce lacinia hendrerit ex nec scelerisque. Nunc pharetra pulvinar blandit. Integer dapibus neque sit amet augue tincidunt imperdiet. Vivamus eleifend malesuada ante quis convallis. Nullam dictum pellentesque porttitor. Mauris consectetur neque arcu, id posuere nulla pretium non. Aenean hendrerit viverra elit. Fusce id maximus ligula, a feugiat ipsum. Maecenas porta ut justo eget mollis.',3,2),(10,'Harry Potter e as Relíquias da Morte ','5539831668',2007,'Praesent ultricies congue augue, eu commodo arcu semper in. Aliquam faucibus turpis a leo congue faucibus a a erat. Praesent gravida sodales risus, nec elementum nisi aliquet quis. Vivamus venenatis vehicula ex sit amet dapibus. Aliquam ut velit non odio congue sagittis. Praesent ac est ante. Donec eu purus placerat, pulvinar tellus id, bibendum lorem. Pellentesque et purus id eros semper efficitur. Quisque feugiat risus id orci faucibus, vitae lacinia libero lobortis.',3,2),(11,'Harry Potter e a Criança Amaldiçoada ','2707565878',2016,'Nam gravida fermentum neque, sed semper dolor rhoncus vel. Nullam quis risus venenatis ipsum lacinia fermentum. Nam iaculis efficitur dignissim. Integer imperdiet eu lacus eu ultrices. Curabitur elementum risus in mollis placerat. Morbi in tellus sed tellus egestas vehicula. Sed hendrerit vitae lacus vitae bibendum. Quisque non tempor lacus. Nullam faucibus, massa ac maximus tristique, nibh sem finibus orci, cursus scelerisque est diam sed lorem.',3,2),(12,'Anjos e demônios','8575421468',2009,'Antes de decifrar O Código Da Vinci, Robert Langdon, o famoso professor de simbologia de Harvard, vive sua primeira aventura em Anjos e demônios, quando tenta impedir que uma antiga sociedade secreta destrua a Cidade do Vaticano.',5,3);
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `sobrenome` varchar(150) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `cpf` char(11) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Fernando','Bade','11958044017','Rua Belém, 1290','12345678900'),(2,'Renata ','Ramos','11999999999','Rua José Quirino, 335','98765432100'),(3,'Sonia','Maria','11974465313','Rua Manoel Garcia, 229','34365446580'),(5,'Floripes','Antonia','11996677663','Avenida Higienópolis, 993','98778945666'),(6,'Cris','Teixeira','11973232412','Avenida Digital House','11122233300');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-24 23:56:34
