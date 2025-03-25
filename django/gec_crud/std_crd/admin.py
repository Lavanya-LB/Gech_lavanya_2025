from django.contrib import admin
from . import models
# Register your models here.


@admin.register(models.student)
class studentAdmin(admin.ModelAdmin):
    list_display = ["id", "name", "email", "password"]