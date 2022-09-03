const { src, dest, watch, series } = require('gulp');

/* -------------------------------------------------- */
/*                  Compilar CSS 
/* -------------------------------------------------- */
const sass = require('gulp-sass')(require('sass'));


function css(done) {
    src('src/scss/**/*.scss')
        .pipe(sass())
        .pipe(dest('build/css'))

    done();
}

function dev() {
    watch('src/scss/**/*.scss', css);

}

exports.css = css;
exports.dev = dev;