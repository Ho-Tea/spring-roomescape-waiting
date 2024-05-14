package roomescape.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

import org.springframework.http.HttpStatus;

public enum ExceptionType {
    EMPTY_NAME(BAD_REQUEST, "이름은 필수 값입니다."),
    EMPTY_TIME(BAD_REQUEST, "시작 시간은 필수 값입니다."),
    EMPTY_DATE(BAD_REQUEST, "날짜는 필수값 입니다."),
    EMPTY_THEME(BAD_REQUEST, "테마는 필수값 입니다."),
    EMPTY_DESCRIPTION(BAD_REQUEST, "테마 설명은 필수값 입니다."),
    EMPTY_THUMBNAIL(BAD_REQUEST, "테마 썸네일은 필수값 입니다."),
    EMPTY_MEMBER(BAD_REQUEST, "사용자 정보는 필수값 입니다."),
    PAST_TIME_RESERVATION(BAD_REQUEST, "이미 지난 시간에 예약할 수 없습니다."),
    DUPLICATE_RESERVATION(BAD_REQUEST, "같은 시간에 이미 예약이 존재합니다."),
    DUPLICATE_RESERVATION_TIME(BAD_REQUEST, "이미 예약시간이 존재합니다."),
    DUPLICATE_THEME(BAD_REQUEST, "이미 동일한 테마가 존재합니다."),
    INVALID_DATE_TIME_FORMAT(BAD_REQUEST, "해석할 수 없는 날짜, 시간 포맷입니다."),
    DELETE_USED_TIME(BAD_REQUEST, "예약이 존재하는 시간은 삭제할 수 없습니다."),
    DELETE_USED_THEME(BAD_REQUEST, "예약이 존재하는 테마는 삭제할 수 없습니다."),
    NOT_FOUND_RESERVATION_TIME(BAD_REQUEST, "존재하지 않는 시간입니다."),
    NOT_FOUND_THEME(BAD_REQUEST, "없는 테마입니다."),
    NOT_FOUND_MEMBER(BAD_REQUEST, "존재하지 않는 유저입니다."),
    NOT_FOUND_ROLE(BAD_REQUEST, "존재하지 않는 권한 정보입니다."),
    WRONG_PASSWORD(BAD_REQUEST, "잘못된 비밀번호입니다."),
    REQUIRED_LOGIN(UNAUTHORIZED, "로그인이 필요합니다."),
    PERMISSION_DENIED(FORBIDDEN, "접근 권한이 없습니다."),
    ;

    private final HttpStatus status;
    private final String message;

    ExceptionType(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}