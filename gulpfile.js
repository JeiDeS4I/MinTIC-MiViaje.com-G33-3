const { src, dest, watch, series } = require('gulp');
const plumber = require('gulp-plumber');

/* -------------------------------------------------- */
/*                  Compilar CSS 
/* -------------------------------------------------- */
const sass = require('gulp-sass')(require('sass'));
const purgecss = require('gulp-purgecss');
const rename = require('gulp-rename');

/* -------------------------------------------------- */
/*                  Compilar Imagenes
/* -------------------------------------------------- */
const imagemin = require('gulp-imagemin');

function css(done) {
    src('src/scss/**/*.scss')
        .pipe(plumber())
        .pipe(sass())
        .pipe(dest('build/css'))

    done();
}

function js(done) {
    src('src/js/app.js')
        .pipe(dest('build/js'))

    done();
}

function cssbuild(done) {
    src('build/css/app.css')
        .pipe(rename({
            suffix: '.min'
        }))
        .pipe(purgecss({
            content: ['index.html']
        }))
        .pipe(dest('build/css'))
    done();
}

function imagenes(done) {
    src('src/Image/**/*')
        .pipe(imagemin({ optimizationLevel: 3 }))
        .pipe(dest('build/img'))
    done();
}

function dev() {
    watch('src/scss/**/*.scss', css);
    watch('src/scss/**/*.scss', cssbuild);
    watch('src/js/app.js', js)

}

exports.css = css;
exports.dev = dev;
exports.js = js;
exports.imagenes = imagenes;
exports.default = series(imagenes, js, dev);