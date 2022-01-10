<script setup lang="ts">

const Champs = {
  name: string
}
const champsData = fetch('http://localhost:8080/v1/champions/all', {
  method: 'get',
  mode: 'no-cors',
  headers: {
    'Content-Type': 'application/json',
  },
})

</script>

<template>
  <h1>hello</h1>
  <li v-for="c in Champs" :key="c.name">
    {{ c.name }}
  </li>
</template>

<route lang="yaml">
meta:
  layout: home
</route>
