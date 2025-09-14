### 그때 할걸 - 회고 기반 금융상품 추천 서비스

<div align="center">
  <h1>그때 할걸 - 회고형 금융상품 추천 서비스</h1>
  <h3>📈 재테크를 위한 금융상품 비교 추천 서비스 📈</h3>
</div>

<br/>

<div align="center">
  <img width="3600" alt="image" src="https://github.com/user-attachments/assets/a573ae19-161c-4ad9-9b7f-4bedd07bf239" />


</div>

<br/>

### 🔗 배포 URL
**[바로 가기](https://halggeol.github.io/halggeol-frontend/#/)**

---
## ✍️ 프로젝트 소개
### 💬 프로젝트 개요
"그때 살걸..." 하고 후회했던 경험, 없으신가요?

**그때 할걸**은 재테크에 관심은 많지만 실천을 망설이는 2030 사용자를 위한 금융상품 비교 추천 서비스입니다. 사용자가 놓쳤던 과거의 금융 기회를 시각적으로 보여주고, 개인에게 최적화된 상품을 추천하여 합리적인 금융 의사결정을 돕습니다.

- **프로젝트명:** 그때 할걸
- **프로젝트 기간:** 2025.07.09 ~ 2025.08.21
- **프로젝트 형태:** KB IT's Your Life 6기 종합실무 프로젝트
- **프로젝트 목표:** 이전에 놓쳤던 금융 기회를 되돌아보고, 개인에게 최적화된 금융상품을 통해 보다 합리적인 금융 의사결정을 돕는 것
- **주요 타겟 사용자:** 재테크를 하고 있거나 입문을 원하는 2030 사용자

---

### 💬 프로젝트 배경

최근 한 조사에 따르면, 2024년 사람들이 가장 크게 후회한 경험 1위는 바로 "**그때 투자할 걸**"이었습니다.
‘적금 대신 주식에 투자할 걸’, ‘그때 1,000만 원이라도 넣어볼걸’ 하는 아쉬움은 많은 사람들이 공감하는 경험입니다. 이런 식으로 지나간 선택을 반복적으로 후회하는 사람들을 흔히 '**껄무새**'라고 부릅니다. [(베이비뉴스, 2024.11.27)](https://ibabynews.com/news/articleView.html?idxno=123569).

이처럼 **재테크에 대한 관심과 후회는 크지만, 실제 행동으로 이어지지 않는 경우가 많습니다.**
특히 2030 세대는 정보 접근성이 높고 금융지식도 갖추고 있음에도 불구하고, 실제 금융상품 가입으로 연결되지 않는 사례가 많습니다.

1. **2030의 이어지지 않는 금융 행위:** 
   - 금융 지식과 관심은 높지만, “복잡해서”, “귀찮아서” 등의 이유로 실행이 미뤄짐.
   - 결국 “그때 할걸”이라는 후회로 이어짐.

2. **기존 금융상품 추천 서비스의 한계:** 
   - 대부분의 서비스가 ‘예금 비교’와 같은 단일 상품 유형에 집중.
   - 다양한 금융상품을 탐색하고 싶은 사용자들의 니즈를 충족하지 못함.

👉 그렇다면, 후회 경험을 동기부여로 삼아 실제 금융상품 가입으로 이어지게 한다면 어떨까?

**그때 할걸**은 바로 이 지점을 해결합니다.
사용자가 놓쳤던 과거의 금융 기회를 **시각적으로 회고**할 수 있게 하고, 이를 기반으로 **개인 맞춤형 금융상품 추천**을 제공하여, 후회를 행동으로 전환하도록 돕는 서비스입니다.

---

## 📌 주요 기능
### 회원가입 및 로그인
#### 회원가입
<img width="900" alt="image" src="https://github.com/user-attachments/assets/c4df33b8-eba9-471c-9bb2-01acfc4f91c9" />

- 사용자 이메일 입력 (아이디)
  - 회원가입 링크 전송
- 이름, 생년월일, 전화번호, 비밀번호 입력

#### 로그인
<img width="900" alt="image" src="https://github.com/user-attachments/assets/81d4344d-f9f6-4636-a8f5-b525fca2b4fb" />

### 메인 대시보드
#### 1. 대시보드
<img width="900" alt="image" src="https://github.com/user-attachments/assets/ce33a6b2-4722-424d-bfb9-83d48831ae05" />

- **그때 할걸 후회지수** (상품을 놓쳤을 때 느낄 수 있는 아쉬움의 크기를 예측한 점수)
   - 과거 회고 인사이트의 '후회해요' 응답을 평균내어 계산
   - 좋음(40점 미만), 보통(40점 이상 70점 미만), 나쁨(70점 미만)
- **후회상품비율** (회고 인사이트가 발행된 상품에 대해 ‘후회해요’라고 응답한 비율)
- **자산유형** (자산 포트폴리오에서 과반수를 차지하는 자산 유형)
   - 공격형: 펀드, 주식 등 공격형 자산이 절반 이상인 상태
   - 안정형: 예적금 등 안정형 자산이 절반 이상인 상태
- **나의 기간별 순자산 그래프**
  - 1개월/3개월/6개월/1년 기준
- **자산 포트폴리오**

#### 2. 그때 할걸 후회상품 랭킹
<img width="900" alt="image" src="https://github.com/user-attachments/assets/06bcd8b0-caa3-4d8a-ac34-3d27d9904c71" />

- **그때 할걸 후회상품 랭킹**
  - 많은 사용자가 가입하지 않아 후회한 금융상품 랭킹
- 고위험상품 숨기기 기능
  -  사용자의 투자 성향 기반으로 고위험상품들을 블락 처리

#### 3. 상품 추천
<img width="900" alt="image" src="https://github.com/user-attachments/assets/cee664b0-8d14-4b70-bfa5-bfb1965c0a4b" />

- 사용자 맞춤 상품 추천(투자 성향, 금융 이해도 기반 추천)
- 사용자 피드백 기반으로 상품 선호도와 반응을 학습하여 추천 정확도를 지속적으로 향상

<img width="700" alt="image" src="https://github.com/user-attachments/assets/56b9a4f8-ecaf-48c0-8798-1d1be8a7ad14" />

- 추천상품 카드로 들어온 상품은 추천에 대한 피드백을 받음
  - 가입 할래요: 금융 상품 가입 링크로 연결
  - 고민해볼래요: 관심상품에 해당 상품 등록
  - 가입 안 할래요: 이후 회고 인사이트에서 확인 가능

### 회고 인사이트
<img width="900" alt="image" src="https://github.com/user-attachments/assets/95ddeaf6-fe9f-4cbf-ba73-e8976f6ab780" />

- 사용자가 설정한 인사이트 발행 주기마다 발행됨
- 회고 상품 목록 선택해 각 상품의 회고 인사이트 확인
- **그때 가입하지 않아서 놓친 금액**
- **예상 후회지수** (내 자산 대비 놓친 기회를 반영한 점수)
- **자산 비교 그래프** (현재 자산과 가입했다면 예상되는 자산)

<img width="900" alt="image" src="https://github.com/user-attachments/assets/fe58b65e-b0cf-4540-a4cf-2019274c0593" />

- 가입 금액에 따라 '**그때 ~만원 가입했다면** ~를 사거나, ~를 할 수 있었다'는 수익금을 시뮬레이션
- AI가 요약해주는 상품 한 줄 설명과 장/단점

<img width="900" alt="image" src="https://github.com/user-attachments/assets/30aeceb2-61e6-446d-bb0d-ba750acd29db" />

- **회고 상품에 대한 사용자 피드백** 조사
  - 후회해요/후회 안해요
  - 후회해요 선택 시 **그때 가입하지 않은 이유** 선택
  - 상품 추천 정확도 향상에 반영
- 해당 상품과 유사한 상품 목록 제공

### 전체 상품 리스트
<img width="900" alt="image" src="https://github.com/user-attachments/assets/c4dcfeea-4d55-42c6-9067-8999acaaafad" />

- 필터
  - 상품 유형 (예금/적금/펀드/연금/외화)
  - 은행/판매사 (1금융권/저축은행)
  - 최소 가입기간 (6/12/24/36개월)
  - 최소 가입 금액
- 정렬
  - 인기순 (조회수 + 관심상품 수 기반)
  - 수익률순

### 상품 상세
<img width="900" alt="image" src="https://github.com/user-attachments/assets/9f8e58bd-f773-4c67-a18b-3cb89d437bcf" />

- 관심상품 등록 및 해제
- 가입하기 링크
- 상품 요약 및 **나와의 적합도**
- AI 상품 한 줄 요약 및 장/단점
- 상품 상세 정보
- 수익 계산기 (일반 금리/최대 금리)

### 관심 상품 리스트
<img width="900" alt="image" src="https://github.com/user-attachments/assets/1ac851bf-c9ca-471d-9553-d3d477b5e3e2" />

- 상품 유형별로 섹션 분리
- 필터
  - 상품 유형 (예금/적금/펀드/연금/외화)
- 정렬
  - 인기순 (조회수 + 관심상품 수 기반)
  - 수익률순
 
### 내 정보
<img width="900"  alt="image" src="https://github.com/user-attachments/assets/4c003422-607f-4bb8-a0e9-1f128a269b1d" />

- 회원가입 시 입력받은 사용자 정보
- 금융이해도와 투자성향 재검사
- 인사이트 제공 주기 (1주/2주/1개월) 변경


---

## 🪄 UX Flow
<img width="1800"  alt="image" src="https://github.com/user-attachments/assets/3ca45498-9b00-4cf4-a151-cbd7fc653db0" />


---

## 💻 시스템 아키텍처
<img width="850" height="4976" alt="image" src="https://github.com/user-attachments/assets/bf57dc2e-b8a3-4320-89c3-aaa7404469e1" />




---

## 🛠️ 개발 환경 및 기술

  <table>
<thead>
<tr>
<th>분류</th>
<th>기술 스택</th>
</tr>
</thead>
<tbody>
<tr>
<td><b>Frontend</b></td>
<td>
<img src="https://img.shields.io/badge/Vue.js-4FC08D?style=flat&logo=vue.js&logoColor=white"/>
<img src="https://img.shields.io/badge/Vue_Router-4FC08D?style=flat&logo=vue.js&logoColor=white"/>
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black"/>
<img src="https://img.shields.io/badge/Pinia-FFD859?style=flat&logo=pinia&logoColor=black"/>
<img src="https://img.shields.io/badge/Axios-5A29E4?style=flat&logo=axios&logoColor=white"/>
<img src="https://img.shields.io/badge/Tailwind_CSS-06B6D4?style=flat&logo=tailwindcss&logoColor=white"/>
<img src="https://img.shields.io/badge/Chart.js-FF6384?style=flat&logo=chart.js&logoColor=white"/>
</td>
</tr>
<tr>
<td><b>Backend</b></td>
<td>
<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=flat&logo=spring-security&logoColor=white"/>
<img src="https://img.shields.io/badge/MyBatis-000000?style=flat&logo=mybatis&logoColor=white"/>
<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white"/>
<img src="https://img.shields.io/badge/Redis-DC382D?style=flat&logo=redis&logoColor=white"/>
<img src="https://img.shields.io/badge/JWT-000000?style=flat&logo=jsonwebtokens&logoColor=white"/>
<img src="https://img.shields.io/badge/MongoDB-47A248?style=flat&logo=mongodb&logoColor=white"/>
<img src="https://img.shields.io/badge/Elasticsearch-005571?style=flat&logo=elasticsearch&logoColor=white"/>
<img src="https://img.shields.io/badge/JUnit5-25A162?style=flat&logo=junit5&logoColor=white"/>
</td>
</tr>
<tr>
<td><b>Data/API</b></td>
<td>
<img src="https://img.shields.io/badge/Financial_Supervisory_Service-004B8D?style=flat&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNCAyNCI+PHBhdGggZmlsbD0id2hpdGUiIGQ9Ik0xMiAyQTEwIDEwIDAgMCAwIDIgMTJhMTAgMTAgMCAwIDAgMTAgMTAgMTAgMTAgMCAwIDAgMTAtMTBBMTAgMTAgMCAwIDAgMTIgMnptMCAyYTggOCAwIDAgMSA4IDggOCA4IDAgMCAxLTggOCA4IDggMCAwIDEtOC04IDggOCAwIDAgMSA4LTh6bS0xIDNoMnY2aC0yem0wIDdoMnYyaC0yeiIvPjwvc3ZnPg=="/>
<img src="https://img.shields.io/badge/MyData-00A5E0?style=flat&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMDAgMTAwIj48cGF0aCBmaWxsPSJ3aGl0ZSIgZD0iTTUwIDEwQTEwIDEwIDAgMCAwIDQwIDIwaDEwYTQgNCAwIDAgMSAwIDhoLTIwYTQgNCAwIDAgMSAwLThoMTBBMTAgMTAgMCAwIDAgNTAgMTB6TTMwIDQwYTQgNCAwIDAgMSA0LDRoMzJhNCA0IDAgMCAxIDAgOGgtMzJhNCA0IDAgMCAxLTQtNHptMCAyMGE0IDQgMCAwIDEgNC00aDIwYTQgNCAwIDAgMSA0IDRoMTJhNCA0IDAgMCAxIDAgOGgtMTJhNCA0IDAgMCAxLTQtNGgtMjBhNCA0IDAgMCAxLTQtNHptNDQgMGE0IDQgMCAwIDEgMCA4aC0xMmE0IDQgMCAwIDEtNC00aC0yMGE0IDQgMCAwIDEtNC00YTQgNCAwIDAgMSA0LTRoMjBhNCA0IDAgMCAxIDQgNGgxMmE0IDQgMCAwIDEgNCA0eiIvPjwvc3ZnPg=="/>
<img src="https://img.shields.io/badge/Google_Gemini-8E44AD?style=flat&logo=google-gemini&logoColor=white"/>
</td>
</tr>
<tr>
<td><b>Deployment</b></td>
<td>
<img src="https://img.shields.io/badge/GitHub_Pages-222222?style=flat&logo=github&logoColor=white"/>
<img src="https://img.shields.io/badge/AWS_EC2-FF9900?style=flat&logo=amazon-ec2&logoColor=white"/>
<img src="https://img.shields.io/badge/AWS_RDS-527FFF?style=flat&logo=amazon-rds&logoColor=white"/>
<img src="https://img.shields.io/badge/Google_Cloud-4285F4?style=flat&logo=google-cloud&logoColor=white"/>
<img src="https://img.shields.io/badge/MongoDB_Atlas-00684A?style=flat&logo=mongodb&logoColor=white"/>
</td>
</tr>
<tr>
<td><b>Collaboration</b></td>
<td>
<img src="https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white"/>
<img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white"/>
<img src="https://img.shields.io/badge/ERD_Cloud-212529?style=flat"/>
<img src="https://img.shields.io/badge/Jira-0052CC?style=flat&logo=jira&logoColor=white"/>
<img src="https://img.shields.io/badge/Notion-000000?style=flat&logo=notion&logoColor=white"/>
<img src="https://img.shields.io/badge/Figma-F24E1E?style=flat&logo=figma&logoColor=white"/>
<img src="https://img.shields.io/badge/Slack-4A154B?style=flat&logo=slack&logoColor=white"/>
</td>
</tr>
</tbody>
</table>

---

## 🤝 협업 방식

- 매주 **1회 정기 회의** 및 매일 **데일리 스크럼**을 통해 진행 상황 공유
- WBS로 세부 작업 분할, Gantt Chart로 일정 시각화
- Jira로 이슈·스프린트 관리, 일정 변경 시 승인
- 컨벤션을 정해 협업 효율을 극대화


<br/>

### 🧑🏻‍💻 브랜치 컨벤션

| 주요 브랜치 | 브랜치명 | 설명 |
| --- | --- | --- |
| 기본 브랜치 | main | 배포 기준 브랜치 |
| 서브 브랜치 | feat/** | 기능 개발 브랜치 |
|  | hotfix/** | 긴급 수정 브랜치 |

ex)  
- `feat/FFBV-60-login` : 로그인 기능 구현 브랜치  
- `hotfix/login-error` : 로그인 에러 긴급 수정 브랜치  

<br/>

### 🗒️ 커밋 컨벤션

| 태그 | 설명 |
| --- | --- |
| `feat` | 새로운 기능 추가 |
| `fix` | 버그 수정 |
| `docs` | 문서 수정 |
| `style` | 코드 포맷팅, 세미콜론 누락 등 (코드 변경 없음) |
| `refactor` | 코드 리팩토링 |
| `test` | 테스트 코드 추가 및 리팩토링 |
| `chore` | 빌드, 패키지 매니저 수정 |

<br/>

### 📌 PR 규칙
- PR 생성 시 반드시 **PR Template 준수**
- main 브랜치로 merge 시도 시 → **코드 리뷰 2명 이상 승인 필수**
- 로컬 빌드/테스트 후 에러 없는지 확인 필수

<br/>

### ✨ 코드 컨벤션
- **Frontend**
  - Prettier 스타일 준수
- **Backend**
  - Google Style Guide 준수
- **Git**
  - commit/push 전 로컬 빌드 및 테스트 완료 확인


---

## 🛢️ 데이터베이스 ERD

<img width="2444" height="2062" alt="erd" src="https://github.com/user-attachments/assets/970c66e9-b08a-469f-8c8a-f6cf166811ae" />

---

## 🎨 디자인 시스템
- **KB 국민은행의 브랜드 컬러**를 메인으로 활용했습니다.
<img width="500" alt="image" src="https://github.com/user-attachments/assets/9a10b34a-851a-46ca-9668-adb4994b4a78" />





---

## 🧑‍🤝‍🧑 팀원 소개
| [권민우](https://github.com/MINUUUUUUUUUUUU) | [김기범](https://github.com/gimogibumo) | [김로아](https://github.com/roa5108) | [김성학](https://github.com/hak0622) | [김하연](https://github.com/rlaxhfn) | [이은우](https://github.com/EUNWOOLEEE) |
| --- | --- | --- | --- | --- | --- |
| ![권민우](https://github.com/MINUUUUUUUUUUUU.png) | <img width="430" alt="image" src="https://github.com/user-attachments/assets/52082d08-d6b0-42f5-a448-8f66d45d4e78" />| ![김로아](https://github.com/roa5108.png) | ![김성학](https://github.com/hak0622.png) | ![김하연](https://github.com/rlaxhfn.png) | ![이은우](https://github.com/EUNWOOLEEE.png) |
| **- Git 총괄**<br/> **- 배포** <br/> **- BE** <br/> **- FE** | **- BE 총괄** <br/> **- Jira 세팅** | **- BE** <br/> **- FE** | **- BE** <br/> **- FE** | **- 팀장** <br/> **- 디자인 & FE 총괄** <br/> **- BE** | **- 문서 총괄** <br/> **- BE** <br/> **- FE** |
| - 금융상품 상세<br/> - 관심상품 등록 및 <br/> 삭제 <br/> - 마이데이터 연동 | - 개인화 추천 <br/> - 상품 랭킹 <br/> - 유사 상품 추천 | - 검색(최근/인기) <br/> - 금융상품 조회 및 <br/> 필터링 | - 회고 인사이트 | - 메인 대시보드 <br/> - 회고 인사이트 | - 회원가입 <br/> - 로그인 <br/> - 마이페이지 <br/> - 사용자 설문 |

---

## 📂 문서

- [기능 명세서](https://docs.google.com/spreadsheets/d/1YgbcnxUqGCbCGAtBIVXaImREHUehpBS2NaNrY802oY8/edit?gid=721364328#gid=721364328)
- [화면 설계서](https://github.com/user-attachments/files/22067692/default.pdf)
- [요구사항 정의서](https://docs.google.com/spreadsheets/d/1YgbcnxUqGCbCGAtBIVXaImREHUehpBS2NaNrY802oY8/edit?gid=970149986#gid=970149986)
- [Vue Router 명세서](https://www.notion.so/thinkable-hayden/23979103accb809c99a6da345c83249f?source=copy_link)
- [API 명세서_Notion](https://www.notion.so/thinkable-hayden/API-22d79103accb80eda857f9ed4a2805e7)
- [기획안](https://github.com/user-attachments/files/21879042/KB.6._.PJT_._20250820_1.pdf)
- [테스트 문서](https://docs.google.com/spreadsheets/d/1YgbcnxUqGCbCGAtBIVXaImREHUehpBS2NaNrY802oY8/edit?gid=1314951162#gid=1314951162)
- [부하 테스트](https://www.notion.so/thinkable-hayden/24d79103accb80d0a5c8e8d81486651c?source=copy_link)
- [WBS - JIRA](https://kb-halggeol.atlassian.net/jira/software/projects/FFBV/boards/35/timeline?atlOrigin=eyJpIjoiMjAxNDFmNzM3MmUyNGM1ZmJhZTBkZThlNDMxMTI4MGIiLCJwIjoiaiJ9)
- [Team Notion](https://www.notion.so/thinkable-hayden/PTJ-11-1-22679103accb80d2ba63f3c7682925a5?source=copy_link)

