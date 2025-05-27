# 🚀 TP DevOps - Tests et Automatisation

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

## 📋 Description du Projet

Ce repository contient la réalisation du **TP1 : Initiation aux Outils DevOps**.

Le projet se concentre sur l'apprentissage des **tests automatisés** et de la **collaboration via Git/GitHub**, en utilisant une approche pratique avec Maven et JUnit.

## 🎯 Objectifs

- ✅ **Tests unitaires** avec JUnit 5
- ✅ **Gestion de version** avec Git
- ✅ **Collaboration** via GitHub (fork, branches, pull requests)
- ✅ **Automatisation** des tests avec Maven
- ✅ **Bonnes pratiques** de développement

## 🏗️ Structure du Projet

```
projet_collaboratif_GI20/
├── 📁 src/
│   ├── 📁 main/java/com/example/
│   │   ├── 📄 Calculatrice.java
│   │   ├── 📄 CalculatriceTest.java
│   │   └── 📄 Main.java
│   └── 📁 test/java/
│       └── 📄 CalculatriceTest.java
├── 📁 target/
├── 📄 pom.xml
├── 📄 message.txt
└── 📄 README.md
```

## 🛠️ Technologies Utilisées

| Technologie | Version | Utilisation |
|-------------|---------|-------------|
| **Java** | 11+ | Langage principal |
| **JUnit** | 5.10.0 | Tests unitaires |
| **Maven** | 3.6+ | Gestionnaire de build |
| **Git** | 2.34+ | Contrôle de version |
| **Kali Linux** | - | Environnement de développement |

## 🚦 Prérequis

Avant de commencer, assurez-vous d'avoir installé :

```bash
# Vérifier Java
java -version
javac -version

# Vérifier Maven
mvn -version

# Vérifier Git
git --version
```

## 📦 Installation et Lancement

### 1️⃣ Cloner le repository

```bash
git clone https://github.com/OUSSAMA-AH/projet_collaboratif_GI20.git
cd projet_collaboratif_GI20
```

### 2️⃣ Compiler le projet

```bash
# Compilation avec Maven
mvn compile
```

### 3️⃣ Exécuter les tests

```bash
# Lancer tous les tests
mvn test

# Avec rapport détaillé
mvn test -Dmaven.test.failure.ignore=true
```

### 4️⃣ Générer le package

```bash
# Créer le JAR
mvn package
```

## 🧪 Tests Implémentés

### Tests de Base
- ✅ **Addition** : `2 + 3 = 5`
- ✅ **Soustraction** : `3 - 2 = 1`
- ✅ **Multiplication** : `2 × 3 = 6`
- ✅ **Division** : `6 ÷ 3 = 2`
- ✅ **Puissance** : `2³ = 8`

### Tests d'Exceptions
- ✅ **Division par zéro** → `IllegalArgumentException`
- ✅ **Exposant négatif** → `IllegalArgumentException`

### Tests Paramétrés
- ✅ **Addition avec données multiples** utilisant `@ParameterizedTest`

## 🌟 Fonctionnalités de la Classe Calculatrice

```java
public class Calculatrice {
    public int addition(int a, int b)        // Addition de deux nombres
    public int soustraction(int a, int b)    // Soustraction de deux nombres
    public int multiplication(int a, int b)  // Multiplication de deux nombres
    public int division(int a, int b)        // Division avec gestion d'erreur
    public int puissance(int a, int b)       // Calcul de puissance avec validation
}
```

## 📊 Résultats des Tests

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running CalculatriceTest
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

Results :
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

[INFO] BUILD SUCCESS
[INFO] Total time: 9.274 s
```

## 🔄 Workflow Git Utilisé

### Branches
- `main` : Branche principale
- `feature/message-oussama` : Branche de développement personnelle

### Commandes Git Principales

```bash
# Création de branche
git checkout -b feature/message-oussama

# Ajout de modifications
git add .
git commit -m "feat: ajout des tests JUnit et message personnel"

# Synchronisation
git push origin feature/message-oussama
```

## 📝 Message Personnel

> "Bonjour, je suis Oussama et j'apprends DevOps avec les tests automatisés !"

## 🔗 Liens Utiles

- 🏠 [Repository Original](https://github.com/GI20AIAC/projet_collaboratif_GI20)
- 📖 [Documentation JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- 🔧 [Guide Maven](https://maven.apache.org/guides/)
- 📚 [Git Documentation](https://git-scm.com/doc)

## 🤝 Contribution

Ce projet fait partie d'un exercice académique. Les contributions sont gérées via le workflow des Pull Requests.

### Étapes pour contribuer :
1. Fork le repository
2. Créer une branche (`git checkout -b feature/nouvelle-fonctionnalite`)
3. Commit les changements (`git commit -m 'Ajout nouvelle fonctionnalité'`)
4. Push vers la branche (`git push origin feature/nouvelle-fonctionnalite`)
5. Créer une Pull Request

## 🎯 Apprentissages Clés

| Concept | Maîtrisé | Description |
|---------|----------|-------------|
| **Tests Unitaires** | ✅ | Écriture de tests JUnit complets |
| **Tests Paramétrés** | ✅ | Utilisation de `@ParameterizedTest` |
| **Gestion d'Exceptions** | ✅ | Validation avec `assertThrows` |
| **Maven Build** | ✅ | Compilation et packaging automatisés |
| **Git Workflow** | ✅ | Branches, merge, collaboration |
| **Documentation** | ✅ | README complet et rapport LaTeX |

---

<div align="center">

![Footer](https://img.shields.io/badge/Made%20with-💙-blue?style=for-the-badge)

</div>
