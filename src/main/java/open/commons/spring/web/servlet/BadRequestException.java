/*
 *
 * This file is generated under this project, "open-commons-spring-web".
 *
 * Date  : 2020. 7. 30. 오후 7:54:55
 *
 * Author: Park_Jun_Hong_(fafanmama_at_naver_com)
 * 
 */

package open.commons.spring.web.servlet;

import org.springframework.stereotype.Controller;

/**
 * 잘못된 요청 데이터를 전달했을 경우, {@link Controller} 내부에서 발생시키는 예외 클래스.
 * 
 * @since 2020. 7. 30.
 * @version
 * @author Park_Jun_Hong_(fafanmama_at_naver_com)
 */
public class BadRequestException extends RuntimeException {

    /**
     *
     * @since 2020. 7. 30.
     */
    private static final long serialVersionUID = 1L;

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 7. 30.		박준홍			최초 작성
     * </pre>
     *
     * @since 2020. 7. 30.
     */
    public BadRequestException() {
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 7. 30.		박준홍			최초 작성
     * </pre>
     *
     * @param arg0
     * @since 2020. 7. 30.
     */
    public BadRequestException(String arg0) {
        super(arg0);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 7. 30.		박준홍			최초 작성
     * </pre>
     *
     * @param message
     * @param cause
     * @since 2020. 7. 30.
     */
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 7. 30.		박준홍			최초 작성
     * </pre>
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     * @since 2020. 7. 30.
     */
    public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 7. 30.		박준홍			최초 작성
     * </pre>
     *
     * @param cause
     * @since 2020. 7. 30.
     */
    public BadRequestException(Throwable cause) {
        super(cause);
    }

}
