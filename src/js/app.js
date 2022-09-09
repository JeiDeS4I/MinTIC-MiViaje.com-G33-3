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
    if (fechainicio) {
        fechainicio.type = Text;

        fechainicio.addEventListener('blur', function() {
            fechainicio.type = 'text';
        })

        fechainicio.addEventListener('focus', function() {
            fechainicio.type = 'date';
        });
    }
}

function cambiarPlaceHolderDate2() {

    const fechafinal = document.querySelector('#fechafinal');
    if (fechafinal) {
        fechafinal.type = Text;

        fechafinal.addEventListener('blur', function() {
            fechafinal.type = 'text';
        })

        fechafinal.addEventListener('focus', function() {
            fechafinal.type = 'date';
        });
    }
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

//Copiado desde BootStrap validation
(function() {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
        .forEach(function(form) {
            form.addEventListener('submit', function(event) {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                }

                form.classList.add('was-validated')
            }, false)
        })
})()