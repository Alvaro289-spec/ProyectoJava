import java.util.Scanner;

public class MENUCONTODOSalv {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("===== MENU =====");
            System.out.println("11. Comprobacion de Temperatura de Congelacion");
            System.out.println("12. Verificacion de Presupuesto Exacto");
            System.out.println("13. Numero Terminado en Cero");
            System.out.println("14. Comparacion de Areas de Dos Circulos");
            System.out.println("15. Comprobacion de Multiplo de 3");
            System.out.println("16. Evaluacion de Sobrepeso por IMC");
            System.out.println("17. Verificacion de Velocidad Maxima");
            System.out.println("18. Igualdad de Tres Numeros");
            System.out.println("19. Comprobacion de Signo Negativo");
            System.out.println("20. Evaluacion de Deuda Acumulada");
            System.out.println("21. Pertenencia a Rango Abierto (15, 85)");
            System.out.println("22. Multiplo Simultaneo de 4 y 6");
            System.out.println("23. Validacion de Hora del Dia");
            System.out.println("24. Pertenencia a Al Menos Un Rango");
            System.out.println("25. Aprobacion por Examen A O Examen B");
            System.out.println("26. Numero Impar Negativo");
            System.out.println("27. Acceso Preferencial a Evento");
            System.out.println("28. Exclusion de Multiplos de 10");
            System.out.println("29. Rango de Presion Arterial Normal");
            System.out.println("30. Evaluacion de Triangulo Isosceles");
            System.out.println("31. Descuento por Compra Voluminosa");
            System.out.println("32. Evaluacion de Comision de Ventas");
            System.out.println("33. Cobro de Estacionamiento Fraccionado");
            System.out.println("34. Aprobacion de Prestamo Hipotecario");
            System.out.println("35. Calculo de Rendimiento Bancario Bruto");
            System.out.println("36. Cobro de Envio a Domicilio");
            System.out.println("37. Calculo de Utilidad Comercial");
            System.out.println("38. Distribucion Proporcional de Ganancias");
            System.out.println("39. Calificacion de Tarjeta de Credito Gold");
            System.out.println("40. Depreciacion Lineal Anual");
            System.out.println("41. Orden Creciente Estricto de Tres Numeros");
            System.out.println("42. Deteccion de Digitos Iguales en Numero de 2 Cifras");
            System.out.println("43. Verificacion de Bisiesto con Regla Completa");
            System.out.println("44. Distancia de Manzana a Frontera de Matriz");
            System.out.println("45. Suma de Digitos de un Numero de 3 Cifras");
            System.out.println("46. Evaluacion de Fecha Valida Simple");
            System.out.println("47. Identificacion de Al Menos Un Par");
            System.out.println("48. Simulacion de Interruptor Escalonado");
            System.out.println("49. Criterio de Beca Universitaria Integrada");
            System.out.println("50. Verificacion de Ecuacion de Circulo en el Origen");
            System.out.println("0. Salir");
            System.out.print("Seleccionate una option: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;
                case 15: ejercicio15(); break;
                case 16: ejercicio16(); break;
                case 17: ejercicio17(); break;
                case 18: ejercicio18(); break;
                case 19: ejercicio19(); break;
                case 20: ejercicio20(); break;
                case 21: ejercicio21(); break;
                case 22: ejercicio22(); break;
                case 23: ejercicio23(); break;
                case 24: ejercicio24(); break;
                case 25: ejercicio25(); break;
                case 26: ejercicio26(); break;
                case 27: ejercicio27(); break;
                case 28: ejercicio28(); break;
                case 29: ejercicio29(); break;
                case 30: ejercicio30(); break;
                case 31: ejercicio31(); break;
                case 32: ejercicio32(); break;
                case 33: ejercicio33(); break;
                case 34: ejercicio34(); break;
                case 35: ejercicio35(); break;
                case 36: ejercicio36(); break;
                case 37: ejercicio37(); break;
                case 38: ejercicio38(); break;
                case 39: ejercicio39(); break;
                case 40: ejercicio40(); break;
                case 41: ejercicio41(); break;
                case 42: ejercicio42(); break;
                case 43: ejercicio43(); break;
                case 44: ejercicio44(); break;
                case 45: ejercicio45(); break;
                case 46: ejercicio46(); break;
                case 47: ejercicio47(); break;
                case 48: ejercicio48(); break;
                case 49: ejercicio49(); break;
                case 50: ejercicio50(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    static void ejercicio11() {
        double temperatura;
        boolean congelacion;
        System.out.print("Dame la temperatura en grados Celsius: ");
        temperatura = sc.nextDouble();
        congelacion = temperatura <= 0;
        System.out.println("El agua esta congelada? " + congelacion);
    }

    static void ejercicio12() {
        double precio1, precio2, precio3, dinero, total;
        boolean alcanza;
        System.out.print("Dame el precio del articulo 1: ");
        precio1 = sc.nextDouble();
        System.out.print("Dame el precio del articulo 2: ");
        precio2 = sc.nextDouble();
        System.out.print("Dame el precio del articulo 3: ");
        precio3 = sc.nextDouble();
        System.out.print("Dame el dinero disponible: ");
        dinero = sc.nextDouble();
        total = precio1 + precio2 + precio3;
        alcanza = total <= dinero;
        System.out.println("Total: " + total);
        System.out.println("El dinero alcanza? " + alcanza);
    }

    static void ejercicio13() {
        int valor;
        boolean terminaEnCero;
        System.out.print("Dame un valor entero: ");
        valor = sc.nextInt();
        terminaEnCero = valor % 10 == 0;
        System.out.println("El numero termina en cero? " + terminaEnCero);
    }

    static void ejercicio14() {
        double r1, r2, area1, area2;
        boolean mayor;
        System.out.print("Dame el radio del primer circulo: ");
        r1 = sc.nextDouble();
        System.out.print("Dame el radio del segundo circulo: ");
        r2 = sc.nextDouble();
        area1 = 3.14159 * r1 * r1;
        area2 = 3.14159 * r2 * r2;
        mayor = area1 > area2;
        System.out.println("Cual rdio es mas grande? " + mayor);
    }

    static void ejercicio15() {
        int numero;
        boolean multiploDe3;
        System.out.print("Dame un numero entero: ");
        numero = sc.nextInt();
        multiploDe3 = numero % 3 == 0;
        System.out.println("El numero es divisible exactamente entre 3? " + multiploDe3);
    }

    static void ejercicio16() {
        double peso, estatura, imc;
        boolean sobrepeso;
        System.out.print("Dame el peso en kg: ");
        peso = sc.nextDouble();
        System.out.print("Dame la estatura en metros: ");
        estatura = sc.nextDouble();
        imc = peso / (estatura * estatura);
        sobrepeso = imc >= 25.0;
        System.out.println("IMC: " + imc);
        System.out.println("Tiene sobrepeso? " + sobrepeso);
    }

    static void ejercicio17() {
        double velocidad;
        boolean excede;
        System.out.print("Dame la velocidad registrada: ");
        velocidad = sc.nextDouble();
        excede = velocidad > 110.0;
        System.out.println("Excede el limite permitido? " + excede);
    }

    static void ejercicio18() {
        int a, b, c;
        boolean identicos;
        System.out.print("Dame el primer numero entero: ");
        a = sc.nextInt();
        System.out.print("Dame el segundo numero entero: ");
        b = sc.nextInt();
        System.out.print("Dame el tercer numero entero: ");
        c = sc.nextInt();
        identicos = (a == b) && (b == c);
        System.out.println("Los tres numeros son identicos? " + identicos);
    }

    static void ejercicio19() {
        double valor;
        boolean negativo;
        System.out.print("Dame un valor decimal: ");
        valor = sc.nextDouble();
        negativo = valor < 0;
        System.out.println("El numero es negativo? " + negativo);
    }

    static void ejercicio20() {
        double ingreso, pagoTarjeta;
        boolean supera;
        System.out.print("Dame el ingreso mensual: ");
        ingreso = sc.nextDouble();
        System.out.print("Dame el pago de tarjeta de credito: ");
        pagoTarjeta = sc.nextDouble();
        supera = pagoTarjeta > ingreso * 0.30;
        System.out.println("El pago supera el 30% del ingreso? " + supera);
    }

    static void ejercicio21() {
        double x;
        boolean dentro;
        System.out.print("Dame un valor decimal x: ");
        x = sc.nextDouble();
        dentro = x > 15 && x < 85;
        System.out.println("Esta dentro del rango (15, 85)? " + dentro);
    }

    static void ejercicio22() {
        int numero;
        boolean multiplo;
        System.out.print("Dame un entero: ");
        numero = sc.nextInt();
        multiplo = numero % 4 == 0 && numero % 6 == 0;
        System.out.println("Es multiplo simultaneo de 4 y 6? " + multiplo);
    }

    static void ejercicio23() {
        int hora;
        boolean valida;
        System.out.print("Dame la hora (0 a 23): ");
        hora = sc.nextInt();
        valida = hora >= 0 && hora <= 23;
        System.out.println("La hora es valida? " + valida);
    }

    static void ejercicio24() {
        int n;
        boolean enRango;
        System.out.print("Dame un entero n: ");
        n = sc.nextInt();
        enRango = (n >= 1 && n <= 10) || (n >= 50 && n <= 60);
        System.out.println("Esta en alguno de los rangos? " + enRango);
    }

    static void ejercicio25() {
        double examen1, examen2;
        boolean aprueba;
        System.out.print("Dame la nota del Examen 1: ");
        examen1 = sc.nextDouble();
        System.out.print("Dame la nota del Examen 2: ");
        examen2 = sc.nextDouble();
        aprueba = examen1 >= 80 || examen2 >= 80;
        System.out.println("Aprueba la certificacion? " + aprueba);
    }

    static void ejercicio26() {
        int numero;
        boolean imparNegativo;
        System.out.print("Dame un entero: ");
        numero = sc.nextInt();
        imparNegativo = numero < 0 && numero % 2 != 0;
        System.out.println("Es un numero impar negativo? " + imparNegativo);
    }

    static void ejercicio27() {
        int edad, vip;
        boolean acceso;
        System.out.print("Dame la edad del asistente: ");
        edad = sc.nextInt();
        System.out.print("Dame 1 si tiene pase VIP, 0 si no: ");
        vip = sc.nextInt();
        acceso = edad < 12 || vip == 1;
        System.out.println("Tiene acceso preferencial? " + acceso);
    }

    static void ejercicio28() {
        int numero;
        boolean noTerminaEnCero;
        System.out.print("Dame un entero positivo: ");
        numero = sc.nextInt();
        noTerminaEnCero = !(numero % 10 == 0);
        System.out.println("El numero NO termina en cero? " + noTerminaEnCero);
    }

    static void ejercicio29() {
        int presion;
        boolean normal;
        System.out.print("Dame la presion sistolica: ");
        presion = sc.nextInt();
        normal = presion >= 90 && presion <= 120;
        System.out.println("La presion esta en el rango saludable? " + normal);
    }

    static void ejercicio30() {
        double a, b, c;
        boolean isosceles;
        System.out.print("Dame el lado a: ");
        a = sc.nextDouble();
        System.out.print("Dame el lado b: ");
        b = sc.nextDouble();
        System.out.print("Dame el lado c: ");
        c = sc.nextDouble();
        isosceles = a == b || a == c || b == c;
        System.out.println("El triangulo es isosceles? " + isosceles);
    }

    static void ejercicio31() {
        int unidades;
        double precioUnitario, costoTotal;
        boolean descuento;
        System.out.print("Dame la cantidad de unidades compradas: ");
        unidades = sc.nextInt();
        System.out.print("Dame el precio unitario: ");
        precioUnitario = sc.nextDouble();
        costoTotal = unidades * precioUnitario;
        descuento = unidades > 50 && costoTotal > 5000;
        System.out.println("Costo total: " + costoTotal);
        System.out.println("Aplica descuento por compra voluminosa? " + descuento);
    }

    static void ejercicio32() {
        double ventasMensuales;
        boolean bono;
        System.out.print("Dame el total de ventas mensuales: ");
        ventasMensuales = sc.nextDouble();
        bono = ventasMensuales >= 20000;
        System.out.println("Obtiene bono especial? " + bono);
    }

    static void ejercicio33() {
        int minutosTotales, horasCompletas, totalPagar;
        System.out.print("Dame los minutos totales de estacionamiento: ");
        minutosTotales = sc.nextInt();
        horasCompletas = minutosTotales / 60;
        if (minutosTotales % 60 > 0) {
            horasCompletas = horasCompletas + 1;
        }
        totalPagar = horasCompletas * 25;
        System.out.println("Total a pagar: $" + totalPagar);
    }

    static void ejercicio34() {
        double sueldoMensual, deudas;
        int antiguedad;
        boolean aprueba;
        System.out.print("Dame el sueldo mensual: ");
        sueldoMensual = sc.nextDouble();
        System.out.print("Dame los anos de antiguedad laboral: ");
        antiguedad = sc.nextInt();
        System.out.print("Dame las deudas actuales: ");
        deudas = sc.nextDouble();
        aprueba = sueldoMensual > 15000 && antiguedad > 3 && deudas < 5000;
        System.out.println("Se aprueba el prestamo hipotecario? " + aprueba);
    }

    static void ejercicio35() {
        double montoInversion, diasPlazo, rendimiento;
        System.out.print("Dame el monto de inversion: ");
        montoInversion = sc.nextDouble();
        System.out.print("Dame los dias de plazo: ");
        diasPlazo = sc.nextDouble();
        rendimiento = montoInversion * 0.095 * (diasPlazo / 365);
        System.out.println("El rendimiento ganado es: " + rendimiento);
    }

    static void ejercicio36() {
        double subtotal, distancia;
        boolean envioGratis;
        System.out.print("Dame el subtotal de la compra: ");
        subtotal = sc.nextDouble();
        System.out.print("Dame la distancia en km: ");
        distancia = sc.nextDouble();
        envioGratis = subtotal > 800 || distancia < 3;
        System.out.println("Califica para envio gratis? " + envioGratis);
    }

    static void ejercicio37() {
        double precioCosto, precioVenta, margen;
        boolean cumple;
        System.out.print("Dame el precio de costo: ");
        precioCosto = sc.nextDouble();
        System.out.print("Dame el precio de venta al publico: ");
        precioVenta = sc.nextDouble();
        margen = (precioVenta - precioCosto) / precioCosto;
        cumple = margen >= 0.30;
        System.out.println("Margen de ganancia: " + margen);
        System.out.println("El margen es mayor o igual al 30%? " + cumple);
    }

    static void ejercicio38() {
        double aportacionA, aportacionB, gananciaTotal, parteA;
        System.out.print("Dame la aportacion del Socio A: ");
        aportacionA = sc.nextDouble();
        System.out.print("Dame la aportacion del Socio B: ");
        aportacionB = sc.nextDouble();
        System.out.print("Dame la ganancia total: ");
        gananciaTotal = sc.nextDouble();
        parteA = gananciaTotal * (aportacionA / (aportacionA + aportacionB));
        System.out.println("La parte de ganancia del Socio A es: " + parteA);
    }

    static void ejercicio39() {
        double ingresoAnual;
        int puntajeCrediticio;
        boolean gold;
        System.out.print("Dame el ingreso anual: ");
        ingresoAnual = sc.nextDouble();
        System.out.print("Dame el puntaje crediticio: ");
        puntajeCrediticio = sc.nextInt();
        gold = ingresoAnual >= 300000 && puntajeCrediticio > 700;
        System.out.println("Califica para tarjeta Gold? " + gold);
    }

    static void ejercicio40() {
        double valorInicial, valorRescate, depreciacionAnual;
        int anosVidaUtil;
        System.out.print("Dame el valor inicial de la maquinaria: ");
        valorInicial = sc.nextDouble();
        System.out.print("Dame el valor de rescate final: ");
        valorRescate = sc.nextDouble();
        System.out.print("Dame los anos de vida util: ");
        anosVidaUtil = sc.nextInt();
        depreciacionAnual = (valorInicial - valorRescate) / anosVidaUtil;
        System.out.println("La depreciacion anual es: " + depreciacionAnual);
    }

    static void ejercicio41() {
        int a, b, c;
        boolean creciente;
        System.out.print("Dame el primer numero entero: ");
        a = sc.nextInt();
        System.out.print("Dame el segundo numero entero: ");
        b = sc.nextInt();
        System.out.print("Dame el tercer numero entero: ");
        c = sc.nextInt();
        creciente = a < b && b < c;
        System.out.println("Estan en orden estrictamente creciente? " + creciente);
    }

    static void ejercicio42() {
        int numero, decenas, unidades;
        boolean iguales;
        System.out.print("Dame un numero de dos digitos (10 a 99): ");
        numero = sc.nextInt();
        decenas = numero / 10;
        unidades = numero % 10;
        iguales = decenas == unidades;
        System.out.println("Los dos digitos son iguales? " + iguales);
    }

    static void ejercicio43() {
        int anio;
        boolean bisiesto;
        System.out.print("Dame un anio: ");
        anio = sc.nextInt();
        bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("El anio es bisiesto? " + bisiesto);
    }

    static void ejercicio44() {
        double x, y;
        boolean primerCuadrante;
        System.out.print("Dame la coordenada x: ");
        x = sc.nextDouble();
        System.out.print("Dame la coordenada y: ");
        y = sc.nextDouble();
        primerCuadrante = x > 0 && y > 0;
        System.out.println("El punto esta en el primer cuadrante? " + primerCuadrante);
    }

    static void ejercicio45() {
        int numero, centenas, decenas, unidades, suma;
        System.out.print("Dame un entero de tres cifras: ");
        numero = sc.nextInt();
        centenas = numero / 100;
        decenas = (numero / 10) % 10;
        unidades = numero % 10;
        suma = centenas + decenas + unidades;
        System.out.println("La suma de los digitos es: " + suma);
    }

    static void ejercicio46() {
        int dia, mes;
        boolean valida;
        System.out.print("Dame el dia: ");
        dia = sc.nextInt();
        System.out.print("Dame el mes: ");
        mes = sc.nextInt();
        valida = (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31);
        System.out.println("La fecha es valida? " + valida);
    }

    static void ejercicio47() {
        int n1, n2, n3;
        boolean alMenosUnPar;
        System.out.print("Dame el primer numero entero: ");
        n1 = sc.nextInt();
        System.out.print("Dame el segundo numero entero: ");
        n2 = sc.nextInt();
        System.out.print("Dame el tercer numero entero: ");
        n3 = sc.nextInt();
        alMenosUnPar = n1 % 2 == 0 || n2 % 2 == 0 || n3 % 2 == 0;
        System.out.println("Al menos uno de los numeros es par? " + alMenosUnPar);
    }

    static void ejercicio48() {
        int s1, s2, s3;
        boolean todosEncendidos;
        System.out.print("Dame el estado del sensor 1 (1 o 0): ");
        s1 = sc.nextInt();
        System.out.print("Dame el estado del sensor 2 (1 o 0): ");
        s2 = sc.nextInt();
        System.out.print("Dame el estado del sensor 3 (1 o 0): ");
        s3 = sc.nextInt();
        todosEncendidos = s1 == 1 && s2 == 1 && s3 == 1;
        System.out.println("Los tres sensores estan encendidos? " + todosEncendidos);
    }

    static void ejercicio49() {
        double promedio, ingresoFamiliar;
        int hermanosEstudiantes;
        boolean beca;
        System.out.print("Dame el promedio academico: ");
        promedio = sc.nextDouble();
        System.out.print("Dame el ingreso familiar mensual: ");
        ingresoFamiliar = sc.nextDouble();
        System.out.print("Dame el numero de hermanos estudiantes: ");
        hermanosEstudiantes = sc.nextInt();
        beca = promedio >= 9.5 || (ingresoFamiliar < 8000 && hermanosEstudiantes > 2);
        System.out.println("Obtiene la beca universitaria? " + beca);
    }

    static void ejercicio50() {
        double x, y, r;
        boolean sobreCircunferencia;
        System.out.print("Dame la coordenada x: ");
        x = sc.nextDouble();
        System.out.print("Dame la coordenada y: ");
        y = sc.nextDouble();
        System.out.print("Dame el radio r: ");
        r = sc.nextDouble();
        sobreCircunferencia = (x * x + y * y) == (r * r);
        System.out.println("El punto cae exactamente sobre la circunferencia? " + sobreCircunferencia);
    }
}