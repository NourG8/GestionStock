-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 02 août 2021 à 16:03
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_stock`
--

-- --------------------------------------------------------

--
-- Structure de la table `article`
--

DROP TABLE IF EXISTS `article`;
CREATE TABLE IF NOT EXISTS `article` (
  `code` int(11) NOT NULL,
  `nom_art` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qte` int(11) NOT NULL,
  `qte_min` int(11) NOT NULL,
  `nom_categ` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nom_magazin` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cin` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `FKp7xuqy55r5yfvs5fl3bogfutl` (`nom_categ`),
  KEY `FKpiuwhqe4wcyn4qx5nmwa4t4u6` (`nom_magazin`),
  KEY `FKeofspcurajvjrcvrci968i753` (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `article`
--

INSERT INTO `article` (`code`, `nom_art`, `qte`, `qte_min`, `nom_categ`, `nom_magazin`, `cin`) VALUES
(102, 'stylo', 150, 2, 'Article Consommé', 'magazin 1', NULL),
(103, 'feutre', 150, 2, 'Article Consommé', 'magazin 1', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `articlee`
--

DROP TABLE IF EXISTS `articlee`;
CREATE TABLE IF NOT EXISTS `articlee` (
  `code_arte` int(11) NOT NULL,
  `nom_arte` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nom_cat` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qtee` int(11) NOT NULL,
  PRIMARY KEY (`code_arte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `articles`
--

DROP TABLE IF EXISTS `articles`;
CREATE TABLE IF NOT EXISTS `articles` (
  `code_arts` int(11) NOT NULL,
  `nom_arts` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nom_cat` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qtes` int(11) NOT NULL,
  PRIMARY KEY (`code_arts`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
CREATE TABLE IF NOT EXISTS `categorie` (
  `nom_categ` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`nom_categ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`nom_categ`, `description`) VALUES
('Article Consommé', 'article a consomme'),
('Materiels', 'Materiels');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(13);

-- --------------------------------------------------------

--
-- Structure de la table `magazin`
--

DROP TABLE IF EXISTS `magazin`;
CREATE TABLE IF NOT EXISTS `magazin` (
  `nom_magazin` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`nom_magazin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `magazin`
--

INSERT INTO `magazin` (`nom_magazin`) VALUES
('magazin 1');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `type_user` varchar(31) COLLATE utf8_unicode_ci NOT NULL,
  `id` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `cin` int(11) DEFAULT NULL,
  `login` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nom` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenom` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`type_user`, `id`, `age`, `cin`, `login`, `nom`, `password`, `photo`, `prenom`) VALUES
('admin', 1, 21, 123456, 'nourguerfali08@gmail.com', 'nour', '123456789', NULL, 'guerfali'),
('admin', 2, 25, 785213, 'aya@gmail.com', 'aya ', '1234567541', NULL, 'guerfali'),
('admin', 3, 50, 978713, 'HASNA@gmail.com', 'hasna', '123456789', NULL, 'nkaies'),
('admin', 4, 50, 978713, 'dsqsfA@gmail.com', 'efsfrfna', '123545465789', NULL, 'nksdqss'),
('admin', 5, 50, 978713, 'wfwdfw@gmail.com', 'hfdsfna', '15654789', NULL, 'sdqfdqss'),
('admin', 6, 50, 234545, 'wfwdfw@gmail.com', 'lotfi', '15654789', NULL, 'sqdfqdqss'),
('admin', 7, 50, 955333, 'wfwdfw@gmail.com', 'aya', '15654789', NULL, 'ssqqss'),
('admin', 8, 50, 978713, 'wfwdfw@gmail.com', 'hfdsfna', '15654789', NULL, 'sdqfdqss'),
('ouvrier', 9, 20, 12345, 'hanin@gmail.com', 'hanin', '987654321', NULL, 'ben jemaa'),
('ouvrier', 10, 22, 12345, 'hdvfsd@gmail.com', 'aaa', '95555554321', NULL, 'sdqsfsa'),
('Utilisateur', 12, 29, 9857641, 'ahmed@gmail.com', 'ben saber', 'ahmed0808', NULL, 'ahmed');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `article`
--
ALTER TABLE `article`
  ADD CONSTRAINT `FKeofspcurajvjrcvrci968i753` FOREIGN KEY (`cin`) REFERENCES `utilisateur` (`id`),
  ADD CONSTRAINT `FKp7xuqy55r5yfvs5fl3bogfutl` FOREIGN KEY (`nom_categ`) REFERENCES `categorie` (`nom_categ`),
  ADD CONSTRAINT `FKpiuwhqe4wcyn4qx5nmwa4t4u6` FOREIGN KEY (`nom_magazin`) REFERENCES `magazin` (`nom_magazin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
