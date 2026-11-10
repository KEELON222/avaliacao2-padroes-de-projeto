# Avaliação 2: Padrões de Projeto

Três questões em Java, cada uma no seu pacote.

| Pacote | Questão | Padrão |
|---|---|---|
| `questao1` | Monitor de estoque | Observer |
| `questao2` | Tarifa de estacionamento | Strategy |
| `questao3` | Pedido de café | Decorator |

## Como rodar

Precisa do JDK 8 ou mais novo. Na raiz do repositório:

```
javac -encoding UTF-8 -d out src/questao1/*.java src/questao2/*.java src/questao3/*.java
java -cp out questao1.Main
java -cp out questao2.Main
java -cp out questao3.Main
```

Numa IDE, marque `src` como pasta de código e rode o `Main` de cada pacote.

## Questão 1: Observer

- `Produto` é o sujeito. Ele guarda a lista de `AreaInteressada` e avisa todas quando a quantidade muda, com o nome do produto, a quantidade anterior e a nova.
- Se a quantidade nova for igual à atual, ninguém é avisado.
- As áreas entram e saem em tempo de execução com `adicionarArea` e `removerArea`.
- As áreas são observadores:
  - `Compras` alerta quando o estoque fica abaixo de 5.
  - `Vendas` alerta quando o produto volta a ter estoque depois de zerar.
  - `Auditoria` registra toda alteração.
- Para criar uma área nova, basta implementar `AreaInteressada`. A classe `Produto` não muda.

## Questão 2: Strategy

- `Tiquete` é o contexto: tem a placa, os minutos e um `PerfilCobranca`. O valor sai de `perfil.calcular(minutos)`, sem `if` ou `switch` sobre o perfil.
- O perfil pode ser trocado no mesmo tíquete com `alterarPerfil`.
- Cada perfil é uma estratégia, com os valores em constantes:

| Perfil | Regra | Constantes |
|---|---|---|
| `Rotativo` | R$ 8,00 por hora iniciada | `VALOR_POR_HORA` |
| `Mensalista` | R$ 5,00 fixo | `VALOR_FIXO` |
| `Conveniado` | 30 min grátis, depois R$ 8,00 por hora iniciada com 25% de desconto | `MINUTOS_GRATUITOS`, `VALOR_POR_HORA`, `PERCENTUAL_DESCONTO` |

- Para criar um perfil novo, basta implementar `PerfilCobranca`, sem mexer no código que já existe.

## Questão 3: Decorator

- `Bebida` é o componente, com descrição e preço.
- As bebidas base são componentes concretos: `Espresso` (R$ 6,00) e `Cha` (R$ 5,00).
- `Complemento` é o decorador abstrato: também é uma `Bebida` e guarda a bebida que embrulha.
- Os complementos são decoradores concretos:
  - `Leite` (R$ 2,00);
  - `Chantilly` (R$ 3,00);
  - `Calda` (R$ 2,50).
- Cada complemento acrescenta o próprio nome à descrição e soma o próprio preço.
- O pedido é montado embrulhando a bebida, por exemplo `new Chantilly(new Leite(new Leite(new Espresso())))`. Por isso o mesmo complemento pode repetir, e não existe classe de combinação pronta.
- Para criar um complemento novo, basta estender `Complemento`.
