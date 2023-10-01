package br.com.hagar;

import org.springframework.stereotype.Service;

import br.com.hagar.exceptions.UnsupportedMathOperationException;
import br.com.hagar.utils.Utils;

@Service
public class MathService {

	public Double sum(String numberOne, String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Utils.convertToDouble(numberOne) + Utils.convertToDouble(numberTwo);
	}

	public Double minus(String numberOne, String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Utils.convertToDouble(numberOne) - Utils.convertToDouble(numberTwo);
	}

	public Double multiply(String numberOne, String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Utils.convertToDouble(numberOne) * Utils.convertToDouble(numberTwo);
	}

	public Double divide(String numberOne, String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Utils.convertToDouble(numberOne) / Utils.convertToDouble(numberTwo);
	}

	public Double media(String numberOne, String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return (Utils.convertToDouble(numberOne) + Utils.convertToDouble(numberTwo)) / 2;
	}

	public Double sqrt(String number) throws Exception {
		if (!Utils.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Math.sqrt(Utils.convertToDouble(number));
	}

}
