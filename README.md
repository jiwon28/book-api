# Book API DevOps Lab

Book API를 개발하고 Docker, Jenkins, Kubernetes, Argo CD를 연결하며 CI/CD 전체 흐름을 학습하는 개인 DevOps 프로젝트입니다.

## Project Goals

- Book API v1과 v2 구현
- 테스트를 포함한 애플리케이션 개발
- Docker 이미지 빌드
- Jenkins CI 파이프라인 구성
- Kubernetes 배포
- Argo CD 기반 GitOps 구성
- 단계적 배포와 모니터링 실습

## Current Status

- [x] Ubuntu VM 설치
- [x] SSH 접속 구성
- [x] Docker 설치 및 실행 검증
- [x] GitHub Public 저장소 생성
- [x] 로컬 Git 저장소 초기화
- [x] 프로젝트 기본 파일 작성
- [x] Book API v1 구현 및 테스트
- [ ] Docker 이미지 빌드
- [ ] Jenkins CI 구성
- [ ] Kubernetes 배포
- [ ] Argo CD 연동
- [ ] 모니터링 구성

## Planned Tech Stack

- Application: Spring Boot
- Container: Docker
- CI: Jenkins
- Orchestration: Kubernetes
- GitOps: Argo CD
- Monitoring: Prometheus, Grafana

## Book API v1

| Method | Endpoint | Description |
| --- | --- | --- |
| `GET` | `/books` | 샘플 도서 목록 조회 |
| `GET` | `/version` | 현재 애플리케이션 버전 확인 |
| `GET` | `/actuator/health` | 애플리케이션 상태 확인 |

### Local verification

```bash
./gradlew clean test
./gradlew bootRun

curl http://localhost:8080/books
curl http://localhost:8080/version
curl http://localhost:8080/actuator/health
```

## Git Workflow

```text
Issue
→ Feature Branch
→ Code
→ Add
→ Commit
→ Push
→ Pull Request
→ Review and CI
→ Merge
```
