<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:template title="Home">
    <jsp:body>
        <h2 class="main-text">Indeciso na hora de comprar algum produto eletrônico?</h2>
        <div class="icons">
            <i class="fa-solid fa-display fa-5x"></i>
            <i class="fa-solid fa-laptop fa-5x"></i>
            <i class="fa-solid fa-keyboard fa-5x"></i>
            <i class="fa-solid fa-computer-mouse fa-5x"></i>
            <i class="fa-solid fa-camera fa-5x"></i>
            <i class="fa-solid fa-headphones fa-5x"></i>
            <i class="fa-solid fa-mobile-button fa-5x"></i>
            <i class="fa-solid fa-print fa-5x"></i>
            <i class="fa-solid fa-tv fa-5x"></i>
        </div>
        <h2 class="main-text">Apenas escolha a opção abaixo que mais te agrada:</h2>
        <div class="options">
            <div class="left-option">
                <h2 class="option-text">Selecione a categoria de produtos que deseja consultar ou avaliar:</h2>
                <form  class="search-form" action="worth-it/listar-produtos" method="post">
                    <select id="category" name="category">
                        <option selected="selected" value="todos">Todos</option>
                        <option value="celular">Celular</option>
                        <option value="computador">Computadores</option>
                        <option value="teclado">Teclados</option>
                        <option value="mouse">Mouse</option>
                        <option value="video game">Videogame</option>
                        <option value="controle">Controles</option>
                        <option value="camera">Cameras</option>
                        <option value="fone de ouvido">Fones de ouvido</option>
                        <option value="impressora">Impressoras</option>
                        <option value="relogio">Relógios</option>
                        <option value="televisao">Televisões</option>
                    </select>
                    <button class="arrow"><i class="fa-solid fa-arrow-right fa-1x"></i></button>
                </form>
            </div>
            <div class="middle-option">
                <h2 class="option-text">Busque pelo nome do produto que deseja consultar ou avaliar:</h2>
                <form class="search-form" action="worth-it/listar-produtos" method="post">
                    <input maxlength="50" type="text" name="name">
                    <button class="arrow"><i class="fa-solid fa-arrow-right fa-1x"></i></button>
                </form>
            </div>
            <div class="right-option">
                <h2 class="option-text">Nos ajude cadastrado e avaliando um produto que ainda não esteja no catálogo</h2>
                <a class="cadastrar-button" href="worth-it/cadastrar-avaliar-produto"><button cadastrar-button>Cadastrar produto</button></a>
            </div>
        </div>
    </jsp:body>
</t:template>