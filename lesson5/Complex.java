public class Complex {
    Double real;
    Double imag;

    public String toString() {
        return String.format("%5.2f + %5.2f i", this.real, this.imag);
    }

    Double absolute() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    Complex conjugate() {
        Complex complex = new Complex();
        complex.real = this.real;
        complex.imag = this.imag * -1;
        return complex;
    }
    
    Complex add(Complex value) {
        Complex result = new Complex();
        result.real = this.real + value.real;
        result.imag = this.imag + value.imag;
        return result;
    }

    Complex subtract(Complex value) {
        Complex result = new Complex();
        result.real = this.real - value.real;
        result.imag = this.imag - value.imag;
        return result;
    }

    Complex multiply(Complex value) {
        Complex result = new Complex();
        result.real = (this.real * value.real) - (this.imag * value.imag);
        result.imag = (this.real * value.imag) + (this.imag * value.real);
        return result;
    }

    Complex divide(Complex value) {
        Complex result = new Complex();
        result.real = (this.real * value.real) + (this.imag * value.imag) / (value.real*value.real) + (value.imag*value.imag);
        result.imag = (this.real * value.imag) - (this.imag * value.real) / (value.real*value.real) + (value.imag*value.imag);
        return result;
    }
}