document.addEventListener('DOMContentLoaded', function() {
    placeholderFecha();
    navegacionFija();
})

function placeholderFecha() {
    window.addEventListener('load', function() {
        cambiarPlaceHolderDate1();
        cambiarPlaceHolderDate2();
    });
}

function cambiarPlaceHolderDate1() {
    const fechainicio = document.querySelector('#fechainicio');
    fechainicio.type = Text;

    fechainicio.addEventListener('blur', function() {
        fechainicio.type = 'text';
    })

    fechainicio.addEventListener('focus', function() {
        fechainicio.type = 'date';
    });
}

function cambiarPlaceHolderDate2() {
    const fechafinal = document.querySelector('#fechafinal');
    fechafinal.type = Text;

    fechafinal.addEventListener('blur', function() {
        fechafinal.type = 'text';
    })

    fechafinal.addEventListener('focus', function() {
        fechafinal.type = 'date';
    });
}

function navegacionFija() {
    const barra = document.querySelector('.header');
    const banner = document.querySelector('.banner');

    window.addEventListener('scroll', () => {
        if (banner.getBoundingClientRect().top < 0) {
            barra.classList.add('fijo');
        } else {
            barra.classList.remove('fijo');
        }
    })
}