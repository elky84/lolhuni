[![Website](https://img.shields.io/website-up-down-green-red/http/shields.io.svg?label=elky-essay)](https://elky84.github.io)
<img src="https://img.shields.io/badge/made%20with-Java-brightgreen.svg" alt="made with Java">

![GitHub forks](https://img.shields.io/github/forks/elky84/loltracer.svg?style=social&label=Fork)
![GitHub stars](https://img.shields.io/github/stars/elky84/loltracer.svg?style=social&label=Stars)
![GitHub watchers](https://img.shields.io/github/watchers/elky84/loltracer.svg?style=social&label=Watch)
![GitHub followers](https://img.shields.io/github/followers/elky84.svg?style=social&label=Follow)

![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)
![GitHub repo size in bytes](https://img.shields.io/github/repo-size/elky84/loltracer.svg)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/elky84/loltracer.svg)

# loltracer(롤 추적기)

## Requirements
- JDK : 1.8
- Maven : 3.3.9
- DB : MariaDB 10.1
- 라인 계정

## Getting Started
1. lolhuni/src/main/resources/application.yml 파일 수정
    - baseUrl : 한국이면 그대로, 외국서버면 해당 서버에 맞게 변경 필요.
    - lineNotifyAccessToken : lineNotify 토큰 발급 후 기입 <https://notify-bot.line.me/my/>
    - datasource 부분 본인 DB에 맞도록 변경
2. db의 api_key에 `Riot Api Key` 추가
    - 반드시 KEY_NAME은 lol로 해야함.
    ```sql
    - INSERT INTO `loltracer`.`api_key` (`KEY_NO`, `KEY_NAME`, `KEY_VALUE`) VALUES ('1515', 'lol', 'apiKey');
    ```

## 예시
![example](./assets/example.jpg)
