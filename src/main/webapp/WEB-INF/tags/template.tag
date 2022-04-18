<%@ tag description="template principal" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="title"%>

<html>
<head>
    <title>${title}</title>
    <base href="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viwport" content="width=device-width, initial-scale=1" />
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/resources/styles/style.css"></link>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://kit.fontawesome.com/a3da5a70fc.js" crossorigin="anonymous"></script>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;400&display=swap');
    </style>
</head>
<body>
    <header>
        <a href="worth-it/index.jsp"><h1 class="logo">worth it?</h1></a>
        <div class="itens-right">
            <div class="total-products-container">
                <c:if test="${totalProducts != null}">
                    <h2 class="total-products">Total de produtos registrados: ${totalProducts}</h2>
                </c:if>
                <c:if test="${totalProducts == null}">
                    <h2 class="total-products">Total de produtos registrados: 0</h2>
                </c:if>
            </div>
            <div class="login-container">
                <c:if test="${status == 'deslogado' || status == null}">
                    <h2 class="status">Status: deslogado</h2>
                    <div class="login">
                        <a href="worth-it/fazer-login"><button>logar</button></a>
                    </div>
                </c:if>
                <c:if test="${status == 'logado'}">
                    <h2 class="status">Status: logado</h2>
                    <div class="login">
                        <a href="worth-it/fazer-login"><button>deslogar</button></a>
                    </div>
                </c:if>
            </div>
        </div>
    </header>
    <main id="content">
        <jsp:doBody></jsp:doBody>
    </main>
    <footer>
        <a href="worth-it/index.jsp"><h1 class="logo">worth it?</h1></a>
        <div class="contacts">
            <h2 class="contact">Contatos </h2>
            <p class="telephone-email">Telefone: 99999-9999  Email: worthit@gmail.com</p>
        </div>
    </footer>
    <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/resources/scripts/index.js"></script>
    <script src="${pageContext.request.contextPath}/assets/libraries/jquery.validade.pt-br.js"></script>
</body>
</html>