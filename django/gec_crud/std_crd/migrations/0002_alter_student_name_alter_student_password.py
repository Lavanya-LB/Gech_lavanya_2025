# Generated by Django 5.1.7 on 2025-03-13 05:13

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('std_crd', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='student',
            name='name',
            field=models.CharField(max_length=200),
        ),
        migrations.AlterField(
            model_name='student',
            name='password',
            field=models.CharField(max_length=200),
        ),
    ]
