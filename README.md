# Biblioteca Java

Sistema de gerenciamento de acervo de biblioteca em Java.

## Funcionalidades
1. Adicionar livros e revistas ao acervo
2. Emprestar e devolver itens
3. Buscar item por título
4. Listar itens disponíveis
5. Top 3 itens mais antigos
6. Agrupar acervo por disponibilidade
7. Listar títulos em maiúsculo

## Estrutura

- ItemAcervo - classe abstrata base
- Livro - subclasse com autor
- Revista - subclasse com edição
- Repositorio<T> - repositório genérico
- Biblioteca - orquestra as operações
- ItemIndisponivelException - exception checked
- ItemNaoEncontradoException - exception unchecked

