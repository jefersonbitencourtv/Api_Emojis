# Api_Emojis
<br>O objetivo desse projeto é converter textos no formato json obtidos de arquivos json usados em outras bibliotecas de emojis para o formato suportado pela biblioteca vdurmont/emoji-java <br/>
<br> **Observacoes** </br>
<br> Alterar o campo seuipv4 para o endereco ip de sua internet, o arquivo fica localizado em Api_Emojis/frontend/src/app.js </br>


<br> **Execuao** </br>
<br>Pode ser testado e utilizado diretamente pela url ou executado na maquina lcaol</br>
<br>https://jsonemojijava.herokuapp.com/</br>
<br> No terminal acessar a pasta Api_Emojis e executar ./mvnw spring-boot:run </br>
<br> No terminal acessar a pasta frontend dentro de Api_Emojis e executar npm start o navegador ira abrir ou poderia acessar pela porta padrao localhost:3000 ou a que seu npm fornecer</br>


<br> **Campos do arquivo no formto json** </br>
<br> alterarCampo pode ser vazio [] ou conter os campos que deseja alterar, Entrada é o nome original do arquivo que voce deseja alterar, Saida é o nome que voce deseja obter </br>
<br> json é o campo para fornecer o texto de emojis no formato json </br>

<br> **Exemplo** </br>
<br>{
    "alterarCampo" : [
        {
            "entrada":"emojis",
            "saida":"emoji"
        },
        {
            "entrada":"descriptions",
            "saida": "description"
        },
         {
            "entrada":"categori",
            "saida": "category"
        }
        ],
    "json":[
  {
    "emojis": "😀"
  , "descriptions": "grinning face"
  , "categori": "Smileys & Emotion"
  , "aliases": [
      "grinning"
    ]
  , "tags": [
      "smile"
    , "happy"
    ]
  , "unicode_version": "6.1"
  , "ios_version": "6.0"
  }
, {
    "emoji": "😃"
  , "descriptions": "grinning face with big eyes"
  , "category": "Smileys & Emotion"
  , "aliases": [
      "smiley"
    ]
  , "tags": [
      "happy"
    , "joy"
    , "haha"
    ]
  , "unicode_version": "6.0"
  , "ios_version": "6.0"
  }
]
}</br>
