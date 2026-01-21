# 🏦 BNK 금융 투자 플랫폼 (Backend)

> Spring Boot 기반의 **금융 투자(펀드) 백엔드 시스템**  
> 인증·보안·투자성향·펀드 관리·전자서명·관리자 기능을 포함한  
> **실무 금융 서비스 중심 백엔드 프로젝트**

---

## 📌 프로젝트 개요

| 항목 | 내용 |
|---|---|
| 프로젝트명 | BNK 금융 투자 플랫폼 (Backend) |
| 개발 형태 | 팀 프로젝트 |
| 담당 역할 | Backend (Spring Boot) |
| 프로젝트 목표 | 실제 은행 앱 수준의 금융 투자 서비스 백엔드 구현 |

---

## 🛠 기술 스택

### Backend
- Java 17  
- Spring Boot  
- Spring Security  
- JWT 인증 (Access / Refresh Token)  
- JPA / MyBatis  
- Oracle DB (XE / Cloud Autonomous DB)

### Infra & Tool
- Git / GitHub  
- GitHub Actions (CI)  
- Linux  

---

## 🧩 핵심 기능

### 🔐 인증 / 보안
- JWT 기반 로그인 / 로그아웃
- BCrypt 비밀번호 암호화
- 로그인 이력 관리
- 사용자 / 관리자 권한 분리 (ROLE_USER, ROLE_ADMIN)
- Stateless 인증 구조 설계

### 📊 펀드 투자 서비스
- 펀드 상품 목록 조회
- 위험등급 / 수익률 / 카테고리 필터링
- 펀드 상세 정보 조회
- 투자 성향 설문 결과에 따른 가입 가능 상품 제한

### 🧑‍💼 관리자 기능
- 펀드 상품 관리
- 사용자 관리
- 가입 및 이용 현황 조회

---

## 🗂 DB 설계

- USER / ROLE / LOGIN_HISTORY 분리 설계
- FUND_MASTER / FUND_DAILY_HISTORY 구조 설계
- 명확한 PK / FK 관계 설정

> 금융 도메인 기준으로 **확장성과 데이터 무결성**을 고려한 DB 모델링

---

## 🔄 서비스 흐름

1. 회원가입 / 로그인  
2. 투자 성향 설문  
3. 가입 가능 펀드 필터링  
4. 펀드 선택  
5. 약관 및 설명서 확인  
6. 전자서명  
7. 가입 완료  

---

