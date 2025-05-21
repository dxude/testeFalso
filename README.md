
# 🧪 Testes com Selenium Automatizados

Este repositório contém **exemplos de testes automatizados** utilizando **Selenium WebDriver** e **JUnit**.

Cada método corresponde a uma **questão prática**, ilustrando diferentes capacidades do Selenium para **interagir com páginas web** e **validar comportamentos**.

---

## ✅ Pré-requisitos

- Java JDK instalado.  
- Selenium WebDriver.  
- JUnit.  
- ChromeDriver compatível com a versão do seu Google Chrome.  
- Dependências configuradas no projeto.

---

## ✅ Tutorial: `helloSeleniumTest()`

No código **SeleniumTest.java** há um código de exemplo de como executar o selenium. O mesmo passo-a-passo também está listado aqui.

### 🚀 Passos do teste automatizado:

1. **Configurar o driver** para a versão do seu navegador:  
```java
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
```  
Baixe o driver apropriado para a sua versão do browser em: [Chrome for Testing](https://googlechromelabs.github.io/chrome-for-testing/).

- O chromedriver deve estar na pasta driver e deve ser correspondente a versão atual seu chrome para o seu SO. No link acima, baixe a versão **Stable**.
- Se você utiliza outro browser, deve procurar o driver correspondente.

2. **Criar e configurar o navegador:**  
```java
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
```

3. **Acessar o site desejado:**  
```java
driver.get("https://www.globo.com/");
```

4. **Capturar a URL atual:**  
```java
String currentUrl = driver.getCurrentUrl();
```

5. **Validar a URL com JUnit:**  
```java
assertEquals("https://www.globo.com/", currentUrl);
```

6. **Encerrar o driver:**  
```java
driver.quit();
```

✅ **Objetivo:**  
→ Demonstrar como abrir uma página, capturar sua URL e validar com **JUnit `assertEquals`**.

---

## ✅ Estrutura de Testes

### 🔹 Questão 1: `helloSeleniumTest()`

✅ **O que o teste faz?**

- Abre o site **https://www.globo.com/**  
- Obtém a **URL atual** carregada pelo navegador.  
- **Valida** que a URL atual corresponde exatamente ao esperado: **"https://www.globo.com/"**.  
- Encerra o navegador.

✅ **Objetivo:**  
→ Demonstrar como abrir uma página, capturar sua URL e validar com **JUnit `assertEquals`**.

---

### 🔹 Questão 2: `test1()`

✅ **O que o teste deve fazer?**

- Abrir o site **https://www.google.com/**.  
- Capturar o **título da página** usando Selenium (`driver.getTitle()`).  
- **Verificar** se o título corresponde a **"Google"** utilizando `assertEquals`.  

✅ **Objetivo:**  
→ Validar que a página **correta foi carregada** e entender como capturar **títulos de páginas**.

---

### 🔹 Questão 3: `test2()`

✅ **O que o teste deve fazer?**

- Abrir o site **https://pt.wikipedia.org/**.  
- Localizar um **elemento pelo ID** utilizando `driver.findElement(By.id("elemento"))`.  
- **Clicar** no elemento com `element.click()`.

✅ **Objetivo:**  
→ Demonstrar a **interação com elementos** via **localização por ID** e execução de **cliques** automáticos.

---

### 🔹 Questão 4: `test3()`

✅ **O que o teste deve fazer?**

- Abrir o site **https://www.globo.com/**.  
- Localizar a **barra de pesquisa** (input).  
- Enviar a string **"fantastico"** para a barra de busca utilizando `sendKeys()`.  
- **Submeter** a busca simulando o pressionamento de **Enter** ou clicando no botão de busca.

✅ **Objetivo:**  
→ Praticar o envio de **dados para campos de entrada** e a **submissão** de formulários.

---

### 🔹 Questão 5: `test4()`

✅ **O que o teste deve fazer?**

- Abrir o site **https://www.globo.com/**.  
- Localizar um **elemento que responda ao passar do mouse** (hover).  
- Usar a classe **`Actions`** do Selenium para **mover o mouse sobre o elemento** (`moveToElement()`), **sem clicar**.

✅ **Objetivo:**  
→ Demonstrar como simular a interação de **hover** com elementos que possuem efeitos ou menus acionados ao passar do mouse.

---

## ✅ Como executar os testes?

1. Configure o **ChromeDriver** compatível na pasta `driver`.  
2. Altere a linha:  
```java
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
```  
caso esteja utilizando outro SO (Linux ou Mac).  

3. Compile e execute os testes com seu **IDE favorito** ou via **linha de comando** utilizando o **JUnit**.

---

## ✅ Links úteis:

- [Selenium Documentation](https://www.selenium.dev/documentation/)  
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)  
- [ChromeDriver Downloads](https://googlechromelabs.github.io/chrome-for-testing/)

---

## ✅ Autor

> Atividade prática de **Testes de Software** com **Selenium** e **JUnit**.
