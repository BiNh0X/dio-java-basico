package dio.webapi.handler;

public class BusinessException extends RuntimeException {
	public BusinessException(String mensagem) {
		super(mensagem);
	}
	public BusinessException(String mensagem, Object ... params) {  // Forma de tornar mensagens mais dinâmicas
		super(String.format(mensagem, params));
	}
}