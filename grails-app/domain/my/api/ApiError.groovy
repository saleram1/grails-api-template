package my.api

class ApiError {
    Integer status = 401
    String message
    String errorCode
    String cause

    static constraints = {
        message(nullable: true)
	cause(nullable: true)
    }
}
