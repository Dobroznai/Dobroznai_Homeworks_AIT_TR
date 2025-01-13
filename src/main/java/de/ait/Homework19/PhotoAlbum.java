package de.ait.Homework19;
/*
    Упражнение 1: Логирование списка фотографий

    Создайте класс PhotoAlbum, в котором будет список фотографий (используйте ArrayList).
    Логируйте следующие действия:
    1. Добавление новой фотографии (уровень INFO).
    2. Удаление фотографии по индексу (уровень WARN).
    3. Попытку удаления несуществующей фотографии (уровень ERROR).
    4. Отображение всех фотографий в альбоме (уровень DEBUG).
     */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


public class PhotoAlbum {
    // создаём объект Logger для ведения логирования

    private static final Logger LOGGER = LoggerFactory.getLogger(PhotoAlbum.class);
    private static ArrayList<String> photos;



    public PhotoAlbum() {
        photos = new ArrayList<>();
    }

    // Добавление фотографии
    public void addPhoto(String photo) {
        photos.add(photo);
        /* используем isInfoEnabled для:
        -Когда логируемое сообщение включает сложные вычисления или формирование строки.
        -Для снижения нагрузки на приложение в высокопроизводительных системах.
         */
        if (LOGGER.isInfoEnabled()) {
            //INFO фиксирует штатные действия, такие как добавление фотографий.
            LOGGER.info("Добавлено новое фото: {}", photo); // используются {} как маркеры для подстановки параметров.
        }
    }

    // Удаление фотографии по индексу
    public void removePhoto(int index) {
        if (index >= 0 && index < photos.size()) {
            String removedPhoto = photos.remove(index);
            //WARN сигнализирует о действиях, требующих внимания, например, удаление.
            LOGGER.warn("Удалено фото в индексе {}: {}", index, removedPhoto);
        } else {
            // ERROR сообщает о критических ошибках, таких как некорректный индекс.
            LOGGER.error("Попытка удалить фото по недействительному индексу: {}", index);
        }
    }

    // Отображение всех фотографий
    public void displayPhotos() {
        if (photos.isEmpty()) {
            LOGGER.info("Альбом пуст.");
        } else {
            //DEBUG даёт подробную информацию для отладки, например, отображение содержимого альбома.
            LOGGER.debug("Вывести на дисплей все фото: ");
            for (int i = 0; i < photos.size(); i++) {
                LOGGER.debug("Фото {}: {}", i, photos.get(i));
            }
        }
    }
}