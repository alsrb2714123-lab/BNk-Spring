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

### ✍️ 전자서명 기반 가입 프로세스
- 약관 동의
- 상품 설명서 확인
- 최종 비밀번호 입력을 통한 전자서명 처리
- 금융 실무 흐름을 반영한 가입 로직 구현

### 🎟 쿠폰 / 혜택 관리
- 쿠폰 발급 및 사용 이력 관리
- 가입 조건 기반 쿠폰 적용 로직

### 🧑‍💼 관리자 기능
- 펀드 상품 관리
- 사용자 관리
- 가입 및 이용 현황 조회

---

## 🗂 DB 설계

- USER / ROLE / LOGIN_HISTORY 분리 설계
- FUND_MASTER / FUND_DAILY_HISTORY 구조 설계
- COUPON / COUPON_HISTORY 관리
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

## 🚀 CI / 운영

- GitHub Actions 기반 빌드 자동화
- 배포 파이프라인 구성 경험

---

## 🧠 프로젝트를 통해 배운 점

- 금융 서비스에서의 **보안·인증 구조 이해**
- JWT 기반 Stateless 아키텍처 설계 경험
- 금융 도메인 중심의 DB 설계 역량 강화
- 실무 서비스 흐름을 고려한 백엔드 로직 구현
- Git 협업 및 브랜치 전략 경험

---

## 🙋‍♂️ 개발자

- 이름: 박민규  
- GitHub: https://github.com/alsrb2714123-lab  
- Email: alsrb2714123@gmail.com
