-- MySQL Script generated by MySQL Workbench
-- Thu Oct 25 14:33:48 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema financeiro
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema financeiro
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `financeiro` DEFAULT CHARACTER SET utf8 ;
USE `financeiro` ;

-- -----------------------------------------------------
-- Table `financeiro`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `financeiro`.`Usuario` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NULL,
  `Email` VARCHAR(45) NULL,
  `Senha` VARCHAR(255) NULL,
  `Data_Nascimento` DATE NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `financeiro`.`Conta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `financeiro`.`Conta` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NULL,
  `Saldo` DECIMAL(9,2) NULL,
  PRIMARY KEY (`Id`),
  CONSTRAINT `Usuario_Id`
    FOREIGN KEY (`Id`)
    REFERENCES `financeiro`.`Usuario` (`Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `financeiro`.`Plano_Contas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `financeiro`.`Plano_Contas` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Descricao` VARCHAR(45) NULL,
  `Tipo` CHAR(1) NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `financeiro`.`Transacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `financeiro`.`Transacao` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Data` DATETIME NULL,
  `Tipo` CHAR(1) NULL,
  `Valor` DECIMAL(9,2) NULL,
  `Descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`Id`),
  CONSTRAINT `Conta_Id`
    FOREIGN KEY ()
    REFERENCES `financeiro`.`Conta` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Plano_Contas_Id`
    FOREIGN KEY ()
    REFERENCES `financeiro`.`Plano_Contas` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;