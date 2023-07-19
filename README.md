# AeroJet-api

MÉTODOS GET
Muestra todos los vuelos de la tabla vuelos
http://localhost:8085/vuelos

Muestra todos los vuelos disponibles
{origen-destino-fecha-hora-disponibles}
http://localhost:8085/vuelos/vuelos-disponibles

Muestra todos los vuelos con la fecha {yyyy-MM-dd}
http://localhost:8085/vuelos/vuelos-fecha-inicio-disponibles?fechaInicio=2023-07-24

Muestra todos los vuelos desde fechaInicio {yyyy-MM-dd} – fechaSalida {yyyy-MM-dd}
http://localhost:8085/vuelos/vuelos-fechas-disponibles?fechaInicio=2023-07-24&fechaSalida=2023-08-10

***********************************************************************************************************************
MÉTODOS POST
Ingresar en JSON para agregar vuelo, por ejemplo:
    {
        "fecha_salida": "2023-07-28",
        "hora_salida": "06:00:00",
        "fecha_llegada": "2023-07-28",
        "hora_llegada": "07:00:00",
        "fecha_reprogramacion": null,
        "estado": "disponible"
    }
http://localhost:8085/vuelos


